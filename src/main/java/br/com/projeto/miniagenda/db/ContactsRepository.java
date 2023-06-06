package br.com.projeto.miniagenda.db;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.miniagenda.model.Contacts;

public interface ContactsRepository extends JpaRepository<Contacts, Long> {
    
}
