package br.com.fiap.challenger.dto.response;

import lombok.Builder;

@Builder
public record EmpresasResponse(

        Long id_Empresa,
        String nome,
        String tamanho,
        String setor,
        String localizacaoGeografica,
        int numeroFuncionarios,
        String tipoEmpresa,
        boolean cliente
) {
}
