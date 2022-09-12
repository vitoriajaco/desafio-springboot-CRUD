package com.desafiogerenciadorcontas.gerenciadorDeContas.model.pagamento;

public class PagamentoFactory {

    public CalculoPagamento calculoPagamento(String recebimentoAlugueis) {
        if (recebimentoAlugueis.equalsIgnoreCase("EM_ATRASO")) {
            return new PagamentoAtrasado();
        }
        if (recebimentoAlugueis.equalsIgnoreCase("ADIANTADO")) {
            return new PagamentoAdiantado();
        }
        return null; // verificar como colocar o "em dia" aqui.
    }

}
