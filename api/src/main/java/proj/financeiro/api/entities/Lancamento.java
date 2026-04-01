package proj.financeiro.api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import proj.financeiro.api.dto.DadosLancamento;

import java.math.BigDecimal;
import java.time.LocalDate;

@Table(name="lancamentos")
@Entity(name="Lancamento")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="codigo")
public class Lancamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String descricao;

    @Column(name = "data_vencimento")
    private LocalDate dataVencimento;

    @Column(name = "data_pagamento")
    private LocalDate dataPagamento;

    private BigDecimal valor;

    private String observacao;

    @Enumerated(EnumType.STRING)
    private TipoLancamento tipo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo_categoria")
    private Categoria categoria;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo_pessoa")
    private Pessoa pessoa;

    public Lancamento(DadosLancamento dadosLancamento){
        this.descricao = dadosLancamento.descricao();
        this.dataPagamento = dadosLancamento.dataPagamento();
        this.dataVencimento = dadosLancamento.dataVencimento();
        this.valor = dadosLancamento.valor();
        this.observacao = dadosLancamento.observacao();
        this.tipo = dadosLancamento.tipo();
        this.categoria = dadosLancamento.categoria();
        this.pessoa = dadosLancamento.pessoa();
    }
}
