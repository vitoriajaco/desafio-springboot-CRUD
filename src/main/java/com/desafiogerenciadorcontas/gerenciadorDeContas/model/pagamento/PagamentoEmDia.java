package com.desafiogerenciadorcontas.gerenciadorDeContas.model.pagamento;

import java.math.BigDecimal;

public class PagamentoEmDia implements CalculoPagamento{
    @Override
    public BigDecimal calcularValorDaConta(BigDecimal valorAtualDaConta) {
        return valorAtualDaConta;
    }
}
