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
@Table(name = "ComportamentoNegocios")
public class ComportamentoNegocios {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_COMPORTAMENTO_NEGOCIOS")
    @SequenceGenerator(name = "SQ_COMPORTAMENTO_NEGOCIOS", sequenceName = "SQ_COMPORTAMENTO_NEGOCIOS", allocationSize = 1)
    @Column(name = "ID_Comportamento")
    private Long id_Comportamento;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "ID_Empresa", referencedColumnName = "ID_Empresa")
    private Empresas empresa;

    @Column(name = "InteracoesPlataforma")
    private int interacoesPlataforma;

    @Column(name = "FrequenciaUso")
    private int frequenciaUso;

    @Column(name = "Feedback")
    private String feedback;

    @Column(name = "UsoRecursosEspecificos")
    private String usoRecursosEspecificos;
}
