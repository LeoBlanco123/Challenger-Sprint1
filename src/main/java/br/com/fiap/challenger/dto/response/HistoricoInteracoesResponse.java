package br.com.fiap.challenger.dto.response;

import lombok.Builder;

@Builder
public record HistoricoInteracoesResponse(

        Long id_Interacao,
        EmpresasResponse empresa,
        String propostaNegocio,
        String contratoAssinado,
        String feedbackServicosProdutos
) {
}
