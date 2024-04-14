package br.com.fiap.challenger.dto.request;

public record TendenciasGastosRequest(
        EmpresasRequest empresa,
        int ano,
        double gastoMarketing,
        double gastoAutomacao
) {
}
