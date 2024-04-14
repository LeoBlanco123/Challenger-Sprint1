package br.com.fiap.challenger.service;

import br.com.fiap.challenger.dto.request.TendenciasGastosRequest;
import br.com.fiap.challenger.dto.response.TendenciasGastosResponse;
import br.com.fiap.challenger.entity.TendenciasGastos;
import br.com.fiap.challenger.repository.TendenciasGastosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class TendenciasGastosService implements ServiceDTO<TendenciasGastos, TendenciasGastosRequest, TendenciasGastosResponse> {

    @Autowired
    private TendenciasGastosRepository repo;

    @Autowired
    private EmpresasService empresasService;

    @Override
    public TendenciasGastos toEntity(TendenciasGastosRequest request) {
        return TendenciasGastos.builder()
                .empresa(empresasService.toEntity(request.empresa()))
                .ano(request.ano())
                .gastoMarketing(request.gastoMarketing())
                .gastoAutomacao(request.gastoAutomacao())
                .build();
    }

    @Override
    public TendenciasGastosResponse toResponse(TendenciasGastos entity) {
        return TendenciasGastosResponse.builder()
                .id_TendenciaGasto(entity.getId_TendenciaGasto())
                .empresa(empresasService.toResponse(entity.getEmpresa()))
                .ano(entity.getAno())
                .gastoMarketing(entity.getGastoMarketing())
                .gastoAutomacao(entity.getGastoAutomacao())
                .build();
    }

    @Override
    public Collection<TendenciasGastos> findAll() {
        return repo.findAll();
    }

    @Override
    public Collection<TendenciasGastos> findAll(Example<TendenciasGastos> example) {
        return List.of();
    }

    @Override
    public TendenciasGastos findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public TendenciasGastos save(TendenciasGastos entity) {
        return repo.save(entity);
    }
}
