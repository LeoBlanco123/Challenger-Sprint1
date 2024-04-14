package br.com.fiap.challenger.resource;

import br.com.fiap.challenger.entity.ComportamentoNegocios;
import br.com.fiap.challenger.repository.ComportamentoNegociosRepository;
import br.com.fiap.challenger.service.ComportamentoNegociosService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "/comportamento")
public class ComportamentoNegociosResource {

    @Autowired
    private ComportamentoNegociosService service;

    @GetMapping
    public Collection<ComportamentoNegocios> findAll() {
        return  service.findAll();
    }

    @GetMapping(value = "/{id}")
    public ComportamentoNegocios findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @Transactional
    @PostMapping
    public ComportamentoNegocios save(@RequestBody ComportamentoNegocios comportamento) {
        return service.save(comportamento);
    }
}
