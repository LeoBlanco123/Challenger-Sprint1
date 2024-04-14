package br.com.fiap.challenger.service;

import br.com.fiap.challenger.dto.request.HistoricoInteracoesRequest;
import br.com.fiap.challenger.dto.response.HistoricoInteracoesResponse;
import br.com.fiap.challenger.entity.HistoricoInteracoes;
import br.com.fiap.challenger.repository.HistoricoInteracoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class HistoricoInteracoesService implements ServiceDTO<HistoricoInteracoes, HistoricoInteracoesRequest, HistoricoInteracoesResponse> {

    @Autowired
    private HistoricoInteracoesRepository repo;

    @Autowired
    private EmpresasService empresasService;

    @Override
    public HistoricoInteracoes toEntity(HistoricoInteracoesRequest request) {
        return HistoricoInteracoes.builder()
                .empresa(empresasService.toEntity(request.empresa()))
                .propostaNegocio(request.propostaNegocio())
                .contratoAssinado(request.contratoAssinado())
                .feedbackServicosProdutos(request.feedbackServicosProdutos())
                .build();
    }

    @Override
    public HistoricoInteracoesResponse toResponse(HistoricoInteracoes entity) {
        return HistoricoInteracoesResponse.builder()
                .id_Interacao(entity.getId_Interacao())
                .empresa(empresasService.toResponse(entity.getEmpresa()))
                .propostaNegocio(entity.getPropostaNegocio())
                .contratoAssinado(entity.getContratoAssinado())
                .feedbackServicosProdutos(entity.getFeedbackServicosProdutos())
                .build();
    }

    @Override
    public Collection<HistoricoInteracoes> findAll() {
        return repo.findAll();
    }

    @Override
    public Collection<HistoricoInteracoes> findAll(Example<HistoricoInteracoes> example) {
        return List.of();
    }

    @Override
    public HistoricoInteracoes findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public HistoricoInteracoes save(HistoricoInteracoes entity) {
        return repo.save(entity);
    }
}
