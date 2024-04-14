package br.com.fiap.challenger.dto.request;

public record HistoricoInteracoesRequest(

        EmpresasRequest empresa,
        String propostaNegocio,
        String contratoAssinado,
        String feedbackServicosProdutos
) {
}
