package com.springbootprj.customerrelationshipmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootprj.customerrelationshipmanagement.entity.Contact;
import com.springbootprj.customerrelationshipmanagement.repository.ContactRepository;

@Service
public class ContactService {
	@Autowired
    private ContactRepository contactRepository;

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }

    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }

}
