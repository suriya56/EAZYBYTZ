package com.springbootprj.customerrelationshipmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootprj.customerrelationshipmanagement.entity.SupportTicket;
import com.springbootprj.customerrelationshipmanagement.service.SupportTicketService;

@RestController
@RequestMapping("/api/supporttickets")
public class SupportTicketController {

    @Autowired
    private SupportTicketService supportTicketService;

    @GetMapping
    public List<SupportTicket> getAllSupportTickets() {
        return supportTicketService.getAllSupportTickets();
    }

    @PostMapping
    public SupportTicket createSupportTicket(@RequestBody SupportTicket supportTicket) {
        return supportTicketService.saveSupportTicket(supportTicket);
    }

    @DeleteMapping("/{id}")
    public void deleteSupportTicket(@PathVariable Long id) {
        supportTicketService.deleteSupportTicket(id);
    }
}