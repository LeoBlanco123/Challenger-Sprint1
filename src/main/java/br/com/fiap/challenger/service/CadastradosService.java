package br.com.fiap.challenger.service;

import br.com.fiap.challenger.dto.request.CadastradosRequest;
import br.com.fiap.challenger.dto.response.CadastradosResponse;
import br.com.fiap.challenger.entity.Cadastrados;
import br.com.fiap.challenger.repository.CadastradosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class CadastradosService implements ServiceDTO<Cadastrados, CadastradosRequest, CadastradosResponse> {

    @Autowired
    private CadastradosRepository repo;

    @Override
    public Cadastrados toEntity(CadastradosRequest cadastradosRequest) {
        return Cadastrados.builder()
                .cnpj(cadastradosRequest.cnpj())
                .senha(cadastradosRequest.senha())
                .nome(cadastradosRequest.nome())
                .build();
    }

    @Override
    public CadastradosResponse toResponse(Cadastrados cadastrados) {
        return CadastradosResponse.builder()
                .cnpj(cadastrados.getCnpj())
                .senha(cadastrados.getSenha())
                .nome(cadastrados.getNome())
                .build();
    }

    @Override
    public Collection<Cadastrados> findAll() {
        return repo.findAll();
    }

    @Override
    public Collection<Cadastrados> findAll(Example<Cadastrados> example) {
        return List.of();
    }

    @Override
    public Cadastrados findById(Long id) {
        return null;
    }

    @Override
    public Cadastrados save(Cadastrados cadastrados) {
        return repo.save(cadastrados);
    }
}
