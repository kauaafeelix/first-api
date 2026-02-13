package kauafelix.lista_de_contatos.controller;


import kauafelix.lista_de_contatos.dto.DtoContactRequest;
import kauafelix.lista_de_contatos.dto.DtoContactResponse;
import kauafelix.lista_de_contatos.model.Contact;
import kauafelix.lista_de_contatos.repository.ContactRepository;
import kauafelix.lista_de_contatos.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contatos")

public class ContactController {


    @Autowired
    private ContactService service;


    @GetMapping
    public ResponseEntity<List<DtoContactResponse>> findAll(){
        List<DtoContactResponse> contactList = service.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(contactList);
    }

    @PostMapping
    public ResponseEntity<DtoContactResponse> salvar(@RequestBody DtoContactRequest request){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(request));    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Void> deleteContact(@PathVariable Long id){
        service.deleteContact(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<DtoContactResponse> update(@PathVariable Long id, @RequestBody DtoContactRequest contactDto){
        return ResponseEntity.ok(service.update(id, contactDto));
    }
}
