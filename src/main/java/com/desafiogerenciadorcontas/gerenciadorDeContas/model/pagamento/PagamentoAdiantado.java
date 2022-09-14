package com.desafiogerenciadorcontas.gerenciadorDeContas.model.pagamento;

import com.desafiogerenciadorcontas.gerenciadorDeContas.Enum.RecebimentoAlugueis;

import java.math.BigDecimal;

public class PagamentoAdiantado implements CalculoPagamento{
    @Override
    public BigDecimal calcularValorDaConta(BigDecimal valorAtualDaConta) {
       BigDecimal descontoAntecipado = valorAtualDaConta.subtract(valorAtualDaConta.multiply(BigDecimal.valueOf(0.05)));
        return descontoAntecipado;

    }
    
}
