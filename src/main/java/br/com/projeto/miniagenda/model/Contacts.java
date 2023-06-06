package br.com.projeto.miniagenda.model;

import org.hibernate.annotations.ColumnDefault;

import br.com.projeto.miniagenda.data.ContactsDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * O JAVA TEM A FAMA DE SER BEM VERBOSO, COMO É UM PROJETO BEM SIMPLES, IREI
 * ABSTRAIR O MÁXIMO QUE EU PUDER DENTRO DOS NOVOS RECURSOS DO JAVA
 * A PROPOSTA É UTILIZAR O LOMBOK LIBRARY PARA ABSTRAIR TODA A VERBOSIDADE DA
 * LINGUAGEM E DEIXÁ-LA TÃO SIMPLES COMO SE EU ESTIVESSE ESCREVENDO EM KOTLIN.
 */

@Getter
@Setter
@NoArgsConstructor // Para trabalhar com o Spring Data JPA e o Repository é necessário inicializar
                   // a entidade com um construtor nulo.
@Entity // Utilizar o Jakarta Persistence para trabalhar com ORM Hibernate para criação
        // e modulação da Entidade
@Table(name = "CONTACTS")
public class Contacts {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Declarando que o atributo ID será um campo do MYSQL que terá
                                                        // como CONSTRAINT o AUTO_INCREMENT
    private Long id;

    @Column(name = "FULL_NAME")
    private String fullName;

    @Column(name = "COMPANY")
    @ColumnDefault("'Não possui'")
    private String company;

    @Column(name = "PHONE_NUMBER")
    private Long phoneNumber;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "BIRTH_DATE")
    private String birthdate;


    public Contacts(ContactsDTO values) {
        this.setFullName(values.fullName());
        this.setCompany(values.company());
        this.setPhoneNumber(values.phoneNumber());
        this.setEmail(values.email());
        this.setBirthdate(values.birthdate());
    }
}
