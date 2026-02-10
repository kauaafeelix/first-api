package kauafelix.lista_de_contatos.repository;


import kauafelix.lista_de_contatos.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Contatorepository extends JpaRepository<Contato, Long> {
}
