package kauafelix.lista_de_contatos.repository;


import kauafelix.lista_de_contatos.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

    boolean existsByTelefone (String telefone);
    boolean existsByTelefoneAndIdNot (String telefone, Long id);
}
