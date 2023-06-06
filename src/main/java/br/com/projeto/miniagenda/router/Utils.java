package br.com.projeto.miniagenda.router;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.projeto.miniagenda.db.ContactsRepository;

public final class Utils {
    public final String homeRouter = "index";
    public final String listRouter = "redirect:/agenda";
    public final String getListRouter = "/agenda/list";
    public final String getFormRouter = "/contacts/new";

    @Autowired
    public ContactsRepository repository;
}
