package br.com.fiap.challenger.service;

import br.com.fiap.challenger.dto.request.CadastroFuncionarioRequest;
import br.com.fiap.challenger.dto.response.CadastroFuncionarioResponse;
import br.com.fiap.challenger.entity.CadastroFuncionario;
import br.com.fiap.challenger.repository.CadastroFuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class CadastroFuncionarioService implements ServiceDTO<CadastroFuncionario, CadastroFuncionarioRequest, CadastroFuncionarioResponse> {

    @Autowired
    private CadastroFuncionarioRepository repo;

    @Autowired
    private CadastradosService cadastradosService;

    @Override
    public CadastroFuncionario toEntity(CadastroFuncionarioRequest cadastroFuncionarioRequest) {
        return CadastroFuncionario.builder()
                .senhaFuncionario(cadastroFuncionarioRequest.senhaFuncionario())
                .cargoFuncionario(cadastroFuncionarioRequest.cargoFuncionario())
                .cadastrado(cadastradosService.toEntity(cadastroFuncionarioRequest.cadastrado()))
                .build();
    }

    @Override
    public CadastroFuncionarioResponse toResponse(CadastroFuncionario cadastroFuncionario) {
        return CadastroFuncionarioResponse.builder()
                .codFuncionario(cadastroFuncionario.getCodFuncionario())
                .senhaFuncionario(cadastroFuncionario.getSenhaFuncionario())
                .cargoFuncionario(cadastroFuncionario.getCargoFuncionario())
                .cadastrado(cadastradosService.toResponse(cadastroFuncionario.getCadastrado()))
                .build();
    }

    @Override
    public Collection<CadastroFuncionario> findAll() {
        return repo.findAll();
    }

    @Override
    public Collection<CadastroFuncionario> findAll(Example<CadastroFuncionario> example) {
        return List.of();
    }

    @Override
    public CadastroFuncionario findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public CadastroFuncionario save(CadastroFuncionario cadastroFuncionario) {
        return repo.save(cadastroFuncionario);
    }
}
