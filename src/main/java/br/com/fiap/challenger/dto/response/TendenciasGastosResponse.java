package br.com.fiap.challenger.dto.response;

import lombok.Builder;

@Builder
public record TendenciasGastosResponse(

        Long id_TendenciaGasto,
        EmpresasResponse empresa,
        int ano,
        double gastoMarketing,
        double gastoAutomacao
) {
}
