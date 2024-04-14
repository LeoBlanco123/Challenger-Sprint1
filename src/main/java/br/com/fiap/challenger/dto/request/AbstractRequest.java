package br.com.fiap.challenger.dto.request;

import br.com.fiap.challenger.entity.Empresas;
import jakarta.validation.constraints.NotNull;

public record AbstractRequest(
        @NotNull(message = "O id é campo obrigatório")
        Long id,
        Empresas empresa
) {
}
