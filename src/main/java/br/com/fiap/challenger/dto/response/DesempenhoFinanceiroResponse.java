package br.com.fiap.challenger.dto.response;

import lombok.Builder;

@Builder
public record DesempenhoFinanceiroResponse(

        Long id_Desempenho,
        EmpresasResponse empresas,
        double receita,
        double lucro,
        double crescimento
) {
}
