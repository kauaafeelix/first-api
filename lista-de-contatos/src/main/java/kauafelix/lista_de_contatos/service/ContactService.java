package kauafelix.lista_de_contatos.service;

import kauafelix.lista_de_contatos.dto.DtoContactRequest;
import kauafelix.lista_de_contatos.dto.DtoContactResponse;
import kauafelix.lista_de_contatos.exceptions.InvalidPhoneNumberException;
import kauafelix.lista_de_contatos.mapper.ContactMapper;
import kauafelix.lista_de_contatos.model.Contact;
import kauafelix.lista_de_contatos.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    ContactRepository repository;

    @Autowired
    ContactMapper mapper;


    public DtoContactResponse save (DtoContactRequest request) {
        if (request.nome() == null || request.nome().isBlank()){
            throw new IllegalArgumentException("O nome não pode estar vazio!");
        }

        if (request.telefone().length() > 15){
            throw new IllegalArgumentException("Telefone não pode ter mais que 15 caracteres");
        }

        if (repository.existsByTelefone(request.telefone())){
            throw new IllegalArgumentException("Telefone já existe e não pode ser cadastrado.");
        }

        Contact contact = mapper.toEntity(request);
        Contact saveContact = repository.save(contact);
        return mapper.toDto(saveContact);
    }

    public List<DtoContactResponse> findAll(){

        return repository.findAll().stream()
                .map(mapper::toDto)
                .toList();
    }

    public void deleteContact(@PathVariable Long id){
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Não é possível deletar: Contato não encontrado!");
        }
        repository.deleteById(id);
    }

    public DtoContactResponse update(Long id, DtoContactRequest contactDTO) {
        Contact contactFind = repository.findById(id)
                .orElseThrow(() ->{
                    throw new IllegalArgumentException("Nenhum contato encontrado!");
                });

        if(contactDTO.nome() == null || contactDTO.nome().isBlank()){
            throw new IllegalArgumentException("O nome do contato não pode ser nulo");
        }

        if(contactDTO.telefone() == null || contactDTO.telefone().isBlank()){
            throw new InvalidPhoneNumberException("O número de telefone do contato não pode ser nulo");
        }

        if(repository.existsByTelefoneAndIdNot(contactDTO.telefone(), id)){
            throw new InvalidPhoneNumberException("Este número de telefone já existe");
        }

        if(contactDTO.telefone().length() > 15){
            throw new InvalidPhoneNumberException("O número de telefone não pode ter mais do que 15 caracteres!");
        }

        contactFind.setNome(contactDTO.nome());
        contactFind.setTelefone(contactDTO.telefone());

        Contact contact = repository.save(contactFind);
        return mapper.toDto(contact);
    }

}
