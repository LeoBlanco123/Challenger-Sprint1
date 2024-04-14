package br.com.fiap.challenger.dto.response;

import lombok.Builder;

@Builder
public record ComportamentoNegociosResponse(

        Long id_Comportamento,
        EmpresasResponse empresa,
        int interacoesPlataforma,
        int frequenciaUso,
        String feedback,
        String usoRecursosEspecificos
) {
}
