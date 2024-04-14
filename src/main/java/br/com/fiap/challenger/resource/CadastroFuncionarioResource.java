package br.com.fiap.challenger.resource;

import br.com.fiap.challenger.entity.CadastroFuncionario;
import br.com.fiap.challenger.repository.CadastroFuncionarioRepository;
import br.com.fiap.challenger.service.CadastroFuncionarioService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "/cadfuncionario")
public class CadastroFuncionarioResource {

    @Autowired
    private CadastroFuncionarioService service;

    @GetMapping
    public Collection<CadastroFuncionario> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public CadastroFuncionario findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @Transactional
    @PostMapping
    public CadastroFuncionario save(@RequestBody CadastroFuncionario funcionario) {
        return service.save(funcionario);
    }

}
