package br.com.fiap.challenger.resource;

import br.com.fiap.challenger.entity.Empresas;
import br.com.fiap.challenger.repository.EmpresasRepository;
import br.com.fiap.challenger.service.EmpresasService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "/empresas")
public class EmpresasResource {

    @Autowired
    private EmpresasService service;

    @GetMapping
    public Collection<Empresas> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public Empresas findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @Transactional
    @PostMapping
    public Empresas save(@RequestBody Empresas empresas) {
        return service.save(empresas);
    }
}
