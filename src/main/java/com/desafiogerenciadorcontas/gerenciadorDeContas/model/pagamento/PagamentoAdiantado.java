package com.desafiogerenciadorcontas.gerenciadorDeContas.model.pagamento;

import java.math.BigDecimal;

public class PagamentoAdiantado implements CalculoPagamento{
    @Override
    public BigDecimal calcularValorDaConta(BigDecimal valorAtualDaConta, BigDecimal valorFinal) {
       BigDecimal descontoAntecipado = valorAtualDaConta.subtract(BigDecimal.valueOf(0.05));
        return descontoAntecipado;
    }
}
