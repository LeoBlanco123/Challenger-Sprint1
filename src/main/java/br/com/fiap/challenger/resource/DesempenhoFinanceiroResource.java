package br.com.fiap.challenger.resource;

import br.com.fiap.challenger.entity.DesempenhoFinanceiro;
import br.com.fiap.challenger.repository.DesempenhoFinanceiroRepository;
import br.com.fiap.challenger.service.DesempenhoFinanceiroService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "/desempenho")
public class DesempenhoFinanceiroResource {

    @Autowired
    private DesempenhoFinanceiroService service;

    @GetMapping
    public Collection<DesempenhoFinanceiro> findAll() {
        return  service.findAll();
    }

    @GetMapping(value = "/{id}")
    public DesempenhoFinanceiro findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @Transactional
    @PostMapping
    public DesempenhoFinanceiro save(@RequestBody DesempenhoFinanceiro desempenho) {
        return service.save(desempenho);
    }
}
