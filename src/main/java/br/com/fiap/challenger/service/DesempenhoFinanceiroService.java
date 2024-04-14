package br.com.fiap.challenger.service;

import br.com.fiap.challenger.dto.request.DesempenhoFinanceiroRequest;
import br.com.fiap.challenger.dto.response.DesempenhoFinanceiroResponse;
import br.com.fiap.challenger.entity.DesempenhoFinanceiro;
import br.com.fiap.challenger.repository.DesempenhoFinanceiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class DesempenhoFinanceiroService implements ServiceDTO<DesempenhoFinanceiro, DesempenhoFinanceiroRequest, DesempenhoFinanceiroResponse> {

    @Autowired
    private DesempenhoFinanceiroRepository repo;

    @Autowired
    private EmpresasService empresasService;

    @Override
    public DesempenhoFinanceiro toEntity(DesempenhoFinanceiroRequest request) {
        return DesempenhoFinanceiro.builder()
                .empresa(empresasService.toEntity(request.empresas()))
                .receita(request.receita())
                .lucro(request.lucro())
                .crescimento(request.crescimento())
                .build();
    }

    @Override
    public DesempenhoFinanceiroResponse toResponse(DesempenhoFinanceiro entity) {
        return DesempenhoFinanceiroResponse.builder()
                .id_Desempenho(entity.getId_Desempenho())
                .empresas(empresasService.toResponse(entity.getEmpresa()))
                .receita(entity.getReceita())
                .lucro(entity.getLucro())
                .crescimento(entity.getCrescimento())
                .build();
    }

    @Override
    public Collection<DesempenhoFinanceiro> findAll() {
        return repo.findAll();
    }

    @Override
    public Collection<DesempenhoFinanceiro> findAll(Example<DesempenhoFinanceiro> example) {
        return List.of();
    }

    @Override
    public DesempenhoFinanceiro findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public DesempenhoFinanceiro save(DesempenhoFinanceiro entity) {
        return repo.save(entity);
    }
}
