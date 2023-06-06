package br.com.projeto.miniagenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projeto.miniagenda.data.ContactsDTO;
import br.com.projeto.miniagenda.db.ContactsRepository;
import br.com.projeto.miniagenda.model.Contacts;
import br.com.projeto.miniagenda.router.Utils;

@Controller
@RequestMapping("/contacts")
public class ContactsController {

    @Autowired
    private ContactsRepository repository;

    @GetMapping
    public String getFormPage() {
        return new Utils().getFormRouter;
    }

    @PostMapping
    public String postForm(ContactsDTO data) {
        var contact = new Contacts(data);
        repository.save(contact);
        System.out.println(contact.getBirthdate());
        return new Utils().listRouter;  //Irá retornar a página de agenda telefônica
    }
}
