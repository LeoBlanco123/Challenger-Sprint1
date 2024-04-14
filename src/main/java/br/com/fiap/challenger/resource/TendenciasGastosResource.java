package br.com.fiap.challenger.resource;

import br.com.fiap.challenger.entity.TendenciasGastos;
import br.com.fiap.challenger.repository.TendenciasGastosRepository;
import br.com.fiap.challenger.service.TendenciasGastosService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "/tendencias")
public class TendenciasGastosResource {

    @Autowired
    private TendenciasGastosService service;

    @GetMapping
    public Collection<TendenciasGastos> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public TendenciasGastos findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @Transactional
    @PostMapping
    public TendenciasGastos save(@RequestBody TendenciasGastos tencencias) {
        return service.save(tencencias);
    }
}
