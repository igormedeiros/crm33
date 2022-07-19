package br.com.igormedeiros.controller;

import br.com.igormedeiros.model.contact.ContactModel;
import br.com.igormedeiros.repository.contact.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @GetMapping(path = "/all")
    public List<ContactModel> getContacts() {
        return contactRepository.findAll();
    }

    @PostMapping(path = "/new")
    public void addContact(@RequestBody ContactModel contactModel) {
        contactRepository.save(contactModel);
    }

    // TODO: get one Contact
    // TODO: update one Contact
    // TODO: delete one Contact
    // TODO: remove stage from a funnel
}
