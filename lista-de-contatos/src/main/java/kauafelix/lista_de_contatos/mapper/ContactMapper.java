package kauafelix.lista_de_contatos.mapper;

import kauafelix.lista_de_contatos.dto.DtoContactRequest;
import kauafelix.lista_de_contatos.dto.DtoContactResponse;
import kauafelix.lista_de_contatos.model.Contact;
import org.springframework.stereotype.Component;

@Component
public class ContactMapper {

    public Contact toEntity(DtoContactRequest dtoContactRequest){
        return new Contact(dtoContactRequest.nome(), dtoContactRequest.email(), dtoContactRequest.telefone());
    }

    public DtoContactResponse toDto(Contact contact){
        return new DtoContactResponse(contact.getId(), contact.getNome(), contact.getEmail(), contact.getTelefone());
    }
}
