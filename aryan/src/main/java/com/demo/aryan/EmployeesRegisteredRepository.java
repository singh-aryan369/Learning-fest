package com.demo.aryan;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeesRegisteredRepository extends JpaRepository<EmployeesRegistered, String> {
    List<EmployeesRegistered> findByPillar(String pillar);
} 