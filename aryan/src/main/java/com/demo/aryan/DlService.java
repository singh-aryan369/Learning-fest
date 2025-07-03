package com.demo.aryan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class DlService {

    @Autowired
    private EmployeesRegisteredRepository employeesRepo;

    @Autowired
    private DlCreationRepository dlRepo;

    public void fillDlTable() {
        List<EmployeesRegistered> allEmployees = employeesRepo.findAll();
        Map<String, List<EmployeesRegistered>> byPillar = allEmployees.stream()
            .collect(Collectors.groupingBy(EmployeesRegistered::getPillar));

        for (Map.Entry<String, List<EmployeesRegistered>> entry : byPillar.entrySet()) {
            String pillar = entry.getKey();
            List<String> emails = entry.getValue().stream()
                .map(EmployeesRegistered::getEmail)
                .collect(Collectors.toList());
            int count = emails.size();

            DlCreation dl = new DlCreation();
            dl.setPillar(pillar);
            dl.setDlEmails(String.join(",", emails));
            dl.setCount(count);

            dlRepo.save(dl);
        }
    }
} 