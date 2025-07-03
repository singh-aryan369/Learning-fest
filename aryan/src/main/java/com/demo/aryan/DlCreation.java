package com.demo.aryan;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dl_creation")
public class DlCreation {
    @Id
    private String pillar;
    private String dlEmails;
    private int count;

    // Getters and setters
    public String getPillar() { return pillar; }
    public void setPillar(String pillar) { this.pillar = pillar; }
    public String getDlEmails() { return dlEmails; }
    public void setDlEmails(String dlEmails) { this.dlEmails = dlEmails; }
    public int getCount() { return count; }
    public void setCount(int count) { this.count = count; }
} 