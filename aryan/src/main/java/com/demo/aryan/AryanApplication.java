package com.demo.aryan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class AryanApplication {

	@Autowired
	private EmployeesRegisteredRepository employeesRepo;

	public static void main(String[] args) {
		SpringApplication.run(AryanApplication.class, args);
	}

	@PostConstruct
	public void insertTestData() {
		employeesRepo.saveAll(Arrays.asList(
			createEmployee("1", "Alice", "alice@example.com", "Business AI", "beginner"),
			createEmployee("2", "Bob", "bob@example.com", "BDC", "beginner"),
			createEmployee("3", "Charlie", "charlie@example.com", "Product Management", "beginner"),
			createEmployee("4", "David", "david@example.com", "Business AI", "beginner"),
			createEmployee("5", "Eve", "eve@example.com", "BDC", "beginner")
		));
	}

	private EmployeesRegistered createEmployee(String id, String name, String email, String pillar, String level) {
		EmployeesRegistered emp = new EmployeesRegistered();
		emp.setId(id);
		emp.setName(name);
		emp.setEmail(email);
		emp.setPillar(pillar);
		emp.setLevel(level);
		return emp;
	}
}
