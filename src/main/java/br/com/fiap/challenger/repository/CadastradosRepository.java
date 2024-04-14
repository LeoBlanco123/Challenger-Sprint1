package br.com.fiap.challenger.repository;

import br.com.fiap.challenger.entity.Cadastrados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastradosRepository extends JpaRepository<Cadastrados, Long> {
}
