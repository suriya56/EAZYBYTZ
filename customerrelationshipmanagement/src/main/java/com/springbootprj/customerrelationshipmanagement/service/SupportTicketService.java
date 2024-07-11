package com.springbootprj.customerrelationshipmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootprj.customerrelationshipmanagement.entity.SupportTicket;
import com.springbootprj.customerrelationshipmanagement.repository.SupportTicketRepository;

@Service
public class SupportTicketService {

    @Autowired
    private SupportTicketRepository supportTicketRepository;

    public List<SupportTicket> getAllSupportTickets() {
        return supportTicketRepository.findAll();
    }

    public SupportTicket saveSupportTicket(SupportTicket supportTicket) {
        return supportTicketRepository.save(supportTicket);
    }

    public void deleteSupportTicket(Long id) {
        supportTicketRepository.deleteById(id);
    }
}