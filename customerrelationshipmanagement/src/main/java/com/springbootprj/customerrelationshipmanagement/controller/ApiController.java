package com.springbootprj.customerrelationshipmanagement.controller;

import com.springbootprj.customerrelationshipmanagement.entity.*;
import com.springbootprj.customerrelationshipmanagement.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private SalesDealService salesRecordService;

    @Autowired
    private TaskService taskService;

    @Autowired
    private SupportTicketService supportTicketService;

    @GetMapping("/api/sales")
    public List<Sales> getSalesRecords() {
        return salesRecordService.getAllSalesDeals();
    }

    @GetMapping("/api/tasks")
    public List<Task> getTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/api/support")
    public List<SupportTicket> getSupportTickets() {
        return supportTicketService.getAllSupportTickets();
    }
}
