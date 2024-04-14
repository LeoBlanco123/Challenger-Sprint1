package br.com.fiap.challenger.resource;

import br.com.fiap.challenger.entity.HistoricoInteracoes;
import br.com.fiap.challenger.repository.HistoricoInteracoesRepository;
import br.com.fiap.challenger.service.HistoricoInteracoesService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "/interacoes")
public class HistoricoInteracoesResource {

    @Autowired
    private HistoricoInteracoesService service;

    @GetMapping
    public Collection<HistoricoInteracoes> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public HistoricoInteracoes findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @Transactional
    @PostMapping
    public HistoricoInteracoes save(@RequestBody HistoricoInteracoes interacoes) {
        return service.save(interacoes);
    }
}
