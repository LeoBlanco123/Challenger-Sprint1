package br.com.fiap.challenger.dto.response;

import lombok.Builder;

@Builder
public record CadastradosResponse(

        String cnpj,
        String senha,
        String nome
) {
}
