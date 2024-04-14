package br.com.fiap.challenger.dto.response;

import br.com.fiap.challenger.dto.request.AbstractRequest;
import lombok.Builder;

@Builder
public record CadastroFuncionarioResponse(

        Long codFuncionario,
        String senhaFuncionario,
        String cargoFuncionario,
        CadastradosResponse cadastrado

) {
}
