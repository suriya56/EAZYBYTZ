package com.springbootprj.customerrelationshipmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.concurrent.TimeUnit;

@Controller
public class DashboardController {

    @GetMapping("/dashboard.html")
    public String getDashboard(Model model) throws InterruptedException {
        // Introduce a delay before proceeding
        TimeUnit.MILLISECONDS.sleep(2000); // Wait for 2 seconds

        // Proceed to render the dashboard.html view
        return "dashboard";
    }
}
