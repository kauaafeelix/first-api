package kauafelix.lista_de_contatos.controller;


import kauafelix.lista_de_contatos.model.Contato;
import kauafelix.lista_de_contatos.repository.Contatorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contatos")

public class ContatoController {

    @Autowired
    private Contatorepository repository;

    @GetMapping
    public List<Contato> listarContatos(){
        return repository.findAll();
    }

    @PostMapping
    public Contato salvarContato(@RequestBody Contato contato){
        return repository.save(contato);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarContato(@PathVariable Long id){
        boolean existeId = repository.existsById(id);

        if (existeId == true){
            repository.deleteById(id);
            return ResponseEntity.noContent().build();
        }else {
         return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public void atualizarContato(@PathVariable Long id, @RequestBody Contato contato){

        Optional buscando = repository.findById(id);

        if (buscando.isPresent()){
            contato.setId(id);
            Contato atualizado = repository.save(contato);
            ResponseEntity.ok(atualizado);
        }else {
            ResponseEntity.notFound().build();
        }
    }
}
