package proj.financeiro.api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name="lancamentos")
@Entity(name="Lancamento")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Lancamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String descricao;

    @Column(name = "data_vencimento")
    private LocalDate dataVencimento;

    @Column(name = "data_pagamento")
    private LocalDate dataPagamento;

    private String valor;

    private String observacao;

    @Enumerated(EnumType.STRING)
    private TipoLancamento tipo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo_categoria")
    private Categoria categoria;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo_pessoa")
    private Pessoa pessoa;

    public Lancamento(proj.financeiro.api.dto.DadosLancamento dadosLancamento){
        this.descricao = dadosLancamento.descricao();
        this.dataPagamento = LocalDate.parse(dadosLancamento.dataPagamento());
        this.dataVencimento = LocalDate.parse(dadosLancamento.dataVencimento());
        this.valor = dadosLancamento.valor();
        this.observacao = dadosLancamento.observacao();
    }
}
