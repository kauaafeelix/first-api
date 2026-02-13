package kauafelix.lista_de_contatos.dto;

public record DtoContactRequest(
        String nome,
        String telefone,
        String email
) {
}
