package br.com.fiap.challenger.resource;

import br.com.fiap.challenger.entity.Cadastrados;
import br.com.fiap.challenger.service.CadastradosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "/cadastrados")
public class CadastradosResource {

    @Autowired
    private CadastradosService cadastradosService;

    @GetMapping
    public Collection<Cadastrados> findAll() {
        return cadastradosService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Cadastrados findById(@PathVariable Long id) {
        return cadastradosService.findById(id);
    }

    @PostMapping
    public Cadastrados save(@RequestBody Cadastrados cadastrados) {
        return cadastradosService.save(cadastrados);
    }
}
