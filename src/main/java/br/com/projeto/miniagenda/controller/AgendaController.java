package br.com.projeto.miniagenda.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projeto.miniagenda.db.AgendaRepository;
import br.com.projeto.miniagenda.db.ContactsRepository;
import br.com.projeto.miniagenda.router.Utils;

@Controller
@RequestMapping("/agenda")
public class AgendaController {

    @Autowired
    private AgendaRepository repository;

    @GetMapping
    public String getListPage(Model model) {
        model.addAttribute("list", repository.findAll());
        return new Utils().getListRouter;
    }

    @DeleteMapping
    public String deleteItem(Long id){
        if (id != null){
            repository.deleteById(id);
        }
        return new Utils().listRouter;
    }
}
