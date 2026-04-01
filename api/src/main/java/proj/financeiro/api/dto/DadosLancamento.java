package proj.financeiro.api.dto;

import proj.financeiro.api.entities.Categoria;
import proj.financeiro.api.entities.Pessoa;
import proj.financeiro.api.entities.TipoLancamento;

import java.math.BigDecimal;
import java.time.LocalDate;

public record DadosLancamento(String descricao,
                              LocalDate dataVencimento,
                              LocalDate dataPagamento,
                              BigDecimal valor,
                              String observacao,
                              TipoLancamento tipo,
                              Categoria categoria,
                              Pessoa pessoa) {
}
