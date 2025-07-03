package com.demo.aryan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HanaTestController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/test-hana")
    public String testHanaConnection() {
        try {
            Integer result = jdbcTemplate.queryForObject("SELECT 1 FROM DUMMY", Integer.class);
            return "HANA Connection Successful! Result: " + result;
        } catch (Exception e) {
            return "HANA Connection Failed: " + e.getMessage();
        }
    }
} 