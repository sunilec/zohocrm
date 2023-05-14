package com.zohocrm.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Contact;
import com.zohocrm.repository.ContactRepository;
import com.zohocrm.services.ContactService;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository contactRepository;

	@Override
	public void saveContact(Contact contact) {
		contactRepository.save(contact);
	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> contacts = contactRepository.findAll();
		return contacts;
	}

	@Override
	public Contact getContactById(Long id) {
		Optional<Contact> findById = contactRepository.findById(id);
		Contact contact = findById.get();
		return contact;
	}

}
