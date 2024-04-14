package br.com.fiap.challenger.service;

import br.com.fiap.challenger.dto.request.EmpresasRequest;
import br.com.fiap.challenger.dto.response.EmpresasResponse;
import br.com.fiap.challenger.entity.Empresas;
import br.com.fiap.challenger.repository.EmpresasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class EmpresasService implements ServiceDTO<Empresas, EmpresasRequest, EmpresasResponse> {

    @Autowired
    private EmpresasRepository repo;

    @Override
    public Empresas toEntity(EmpresasRequest empresasRequest) {
        return Empresas.builder()
                .nome(empresasRequest.nome())
                .tamanho(empresasRequest.tamanho())
                .setor(empresasRequest.setor())
                .localizacaoGeografica(empresasRequest.localizacaoGeografica())
                .numeroFuncionarios(empresasRequest.numeroFuncionarios())
                .tipoEmpresa(empresasRequest.tipoEmpresa())
                .cliente(empresasRequest.cliente())
                .build();
    }

    @Override
    public EmpresasResponse toResponse(Empresas empresas) {
        return EmpresasResponse.builder()
                .id_Empresa(empresas.getId_Empresa())
                .nome(empresas.getNome())
                .tamanho(empresas.getTamanho())
                .setor(empresas.getSetor())
                .localizacaoGeografica(empresas.getLocalizacaoGeografica())
                .numeroFuncionarios(empresas.getNumeroFuncionarios())
                .tipoEmpresa(empresas.getTipoEmpresa())
                .cliente(empresas.isCliente())
                .build();
    }

    @Override
    public Collection<Empresas> findAll() {
        return repo.findAll();
    }

    @Override
    public Collection<Empresas> findAll(Example<Empresas> example) {
        return List.of();
    }

    @Override
    public Empresas findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Empresas save(Empresas empresas) {
        return repo.save(empresas);
    }
}
