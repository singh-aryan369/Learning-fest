package com.demo.aryan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DlController {

    @Autowired
    private DlService dlService;

    @GetMapping("/fill-dl")
    public String fillDl() {
        dlService.fillDlTable();
        return "DL Table filled successfully!";
    }
} 