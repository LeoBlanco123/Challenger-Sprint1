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
@Table(name = "HistoricoInteracoes")
public class HistoricoInteracoes {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_HISTORICO_INTERACOES")
    @SequenceGenerator(name = "SQ_HISTORICO_INTERACOES", sequenceName = "SQ_HISTORICO_INTERACOES", allocationSize = 1)
    @Column(name = "ID_Interacao")
    private Long id_Interacao;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "ID_Empresa", referencedColumnName = "ID_Empresa")
    private Empresas empresa;

    @Column(name = "PropostaNegocio")
    private String propostaNegocio;

    @Column(name = "ContratoAssinado")
    private String contratoAssinado;

    @Column(name = "FeedbackServicosProdutos")
    private String feedbackServicosProdutos;
}
