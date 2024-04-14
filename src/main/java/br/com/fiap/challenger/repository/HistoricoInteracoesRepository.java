package br.com.fiap.challenger.repository;


import br.com.fiap.challenger.entity.HistoricoInteracoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricoInteracoesRepository extends JpaRepository<HistoricoInteracoes, Long> {
}
