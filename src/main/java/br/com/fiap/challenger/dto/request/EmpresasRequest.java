package br.com.fiap.challenger.dto.request;

public record EmpresasRequest(

        String nome,
        String tamanho,
        String setor,
        String localizacaoGeografica,
        int numeroFuncionarios,
        String tipoEmpresa,
        boolean cliente
) {
}
