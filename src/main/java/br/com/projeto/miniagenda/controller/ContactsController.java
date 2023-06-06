package br.com.projeto.miniagenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projeto.miniagenda.router.Utils;

@Controller
@RequestMapping("/contacts")
public class ContactsController {
    
    @GetMapping
    public String getFormPage() {
        return new Utils().getFormRouter;
    }

    @PostMapping
    public String postForm() {
        return new Utils().listRouter;  //Irá retornar a página de agenda telefônica
    }
}
