package br.com.fiap.challenger.dto.request;

public record ComportamentoNegociosRequest(

        EmpresasRequest empresa,
        int interacoesPlataforma,
        int frequenciaUso,
        String feedback,
        String usoRecursosEspecificos
) {
}
