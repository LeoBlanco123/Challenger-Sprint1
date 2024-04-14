package br.com.fiap.challenger.dto.request;

public record DesempenhoFinanceiroRequest(

        EmpresasRequest empresas,
        double receita,
        double lucro,
        double crescimento

) {
}
