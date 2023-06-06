package br.com.projeto.miniagenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projeto.miniagenda.router.Utils;

/**
 * PRIMEIRA PÁGINA DO SISTEMA
 */

@Controller
@RequestMapping("/") 
/** Declarando as binds annotation do Spring Framework para mapeamento das rotas da classe */
public class HomeController {
    
    @GetMapping 
    //Mapeando a rota principal da aplicação para a página de listagem
    public String homePage() {
        return new Utils().homeRouter;  //Irá retornar o mapeamento declarado na classe Utils. No caso, "/index"
    }
}
