package com.desafiogerenciadorcontas.gerenciadorDeContas.model.pagamento;

import com.desafiogerenciadorcontas.gerenciadorDeContas.model.usuario.ContasReceber;

public class PagamentoFactory {

    ContasReceber contasReceber;

    public Object calculoPagamento(String recebimentoAlugueis) {
        if (recebimentoAlugueis.equalsIgnoreCase("EM_ATRASO")) {
            return new PagamentoAtrasado();
        }
        if (recebimentoAlugueis.equalsIgnoreCase("ADIANTADO")) {
            return new PagamentoAdiantado();
        } else return contasReceber.getValorRecebimento();

    }
}
