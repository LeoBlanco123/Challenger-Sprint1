package br.com.fiap.challenger.repository;

import br.com.fiap.challenger.entity.CadastroFuncionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroFuncionarioRepository extends JpaRepository<CadastroFuncionario, Long> {
}
