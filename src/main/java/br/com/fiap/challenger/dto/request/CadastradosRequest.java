package br.com.fiap.challenger.dto.request;

import jakarta.validation.constraints.NotNull;

public record CadastradosRequest(
        @NotNull(message = "O cnpj é obrigatório")
        String cnpj,
        String senha,
        String nome
) {
}
