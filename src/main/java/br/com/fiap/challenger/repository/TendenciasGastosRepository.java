package br.com.fiap.challenger.repository;


import br.com.fiap.challenger.entity.TendenciasGastos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TendenciasGastosRepository extends JpaRepository<TendenciasGastos, Long> {
}
