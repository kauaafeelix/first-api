package kauafelix.lista_de_contatos.dto;

public record DtoContactResponse(
        Long id,
        String nome,
        String email,
        String telefone
) {
}
