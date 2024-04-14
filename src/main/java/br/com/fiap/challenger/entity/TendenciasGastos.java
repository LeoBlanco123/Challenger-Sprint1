package br.com.fiap.challenger.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "TendenciasGastos")
public class TendenciasGastos {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TENDENCIAS_GASTOS")
    @SequenceGenerator(name = "SQ_TENDENCIAS_GASTOS", sequenceName = "SQ_TENDENCIAS_GASTOS", allocationSize = 1)
    @Column(name = "ID_TendenciaGasto")
    private Long id_TendenciaGasto;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "ID_Empresa", referencedColumnName = "ID_Empresa")
    private Empresas empresa;

    @Column(name = "Ano")
    private int ano;

    @Column(name = "GastoMarketing")
    private double gastoMarketing;

    @Column(name = "GastoAutomacao")
    private double gastoAutomacao;
}
