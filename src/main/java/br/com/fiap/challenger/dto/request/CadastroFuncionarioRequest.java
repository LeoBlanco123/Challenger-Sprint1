package br.com.fiap.challenger.dto.request;

public record CadastroFuncionarioRequest(

        String senhaFuncionario,
        String cargoFuncionario,
        CadastradosRequest cadastrado

) {
}
