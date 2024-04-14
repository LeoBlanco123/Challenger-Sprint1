package br.com.fiap.challenger.repository;

import br.com.fiap.challenger.entity.DesempenhoFinanceiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesempenhoFinanceiroRepository extends JpaRepository<DesempenhoFinanceiro, Long> {
}
