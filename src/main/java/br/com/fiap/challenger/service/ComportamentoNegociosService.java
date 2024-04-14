package br.com.fiap.challenger.service;

import br.com.fiap.challenger.dto.request.ComportamentoNegociosRequest;
import br.com.fiap.challenger.dto.response.ComportamentoNegociosResponse;
import br.com.fiap.challenger.entity.ComportamentoNegocios;
import br.com.fiap.challenger.repository.ComportamentoNegociosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class ComportamentoNegociosService implements ServiceDTO<ComportamentoNegocios, ComportamentoNegociosRequest, ComportamentoNegociosResponse> {

    @Autowired
    private ComportamentoNegociosRepository repo;

    @Autowired
    private EmpresasService empresasService;

    @Override
    public ComportamentoNegocios toEntity(ComportamentoNegociosRequest request) {
        return ComportamentoNegocios.builder()
                .empresa(empresasService.toEntity(request.empresa()))
                .interacoesPlataforma(request.interacoesPlataforma())
                .frequenciaUso(request.frequenciaUso())
                .feedback(request.feedback())
                .usoRecursosEspecificos(request.usoRecursosEspecificos())
                .build();
    }

    @Override
    public ComportamentoNegociosResponse toResponse(ComportamentoNegocios entity) {
        return ComportamentoNegociosResponse.builder()
                .id_Comportamento(entity.getId_Comportamento())
                .empresa(empresasService.toResponse(entity.getEmpresa()))
                .interacoesPlataforma(entity.getInteracoesPlataforma())
                .frequenciaUso(entity.getFrequenciaUso())
                .feedback(entity.getFeedback())
                .usoRecursosEspecificos(entity.getUsoRecursosEspecificos())
                .build();
    }

    @Override
    public Collection<ComportamentoNegocios> findAll() {
        return repo.findAll();
    }

    @Override
    public Collection<ComportamentoNegocios> findAll(Example<ComportamentoNegocios> example) {
        return List.of();
    }

    @Override
    public ComportamentoNegocios findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public ComportamentoNegocios save(ComportamentoNegocios entity) {
        return repo.save(entity);
    }
}
