package br.com.projeto.miniagenda.data;


public record ContactsDTO(
    String fullName, 
    String company, 
    Long phoneNumber, 
    String email, 
    String birthdate
) {
    
}
