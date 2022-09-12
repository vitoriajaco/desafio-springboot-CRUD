package com.desafiogerenciadorcontas.gerenciadorDeContas.model.pagamento;

import java.math.BigDecimal;

public class PagamentoAtrasado implements CalculoPagamento{

    @Override
    public BigDecimal calcularValorDaConta(BigDecimal valorAtualDaConta, BigDecimal valorFinal) {
        BigDecimal valorComAtraso = valorAtualDaConta.add(BigDecimal.valueOf(0.035));
        return valorComAtraso;
    }
}
