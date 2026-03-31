package proj.financeiro.api.dto;

public record DadosLancamento(String descricao,
                              String dataVencimento,
                              String dataPagamento,
                              String valor,
                              String observacao) {
}
