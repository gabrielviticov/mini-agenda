package br.com.projeto.miniagenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projeto.miniagenda.router.Utils;

@Controller
@RequestMapping("/agenda")
public class AgendaController {
    
    @GetMapping
    public String getListPage() {
        return new Utils().getListRouter;
    }
}
