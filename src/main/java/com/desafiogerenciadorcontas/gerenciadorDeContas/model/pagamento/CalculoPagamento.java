package com.desafiogerenciadorcontas.gerenciadorDeContas.model.pagamento;

import java.math.BigDecimal;

public interface CalculoPagamento {

    public BigDecimal calcularValorDaConta(BigDecimal valorAtualDaConta, BigDecimal valorFinal);
}
