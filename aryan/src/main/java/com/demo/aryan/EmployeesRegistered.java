package com.demo.aryan;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees_registered")
public class EmployeesRegistered {
    @Id
    private String id;
    private String name;
    private String email;
    private String pillar;
    private String level;

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPillar() { return pillar; }
    public void setPillar(String pillar) { this.pillar = pillar; }
    public String getLevel() { return level; }
    public void setLevel(String level) { this.level = level; }
} 