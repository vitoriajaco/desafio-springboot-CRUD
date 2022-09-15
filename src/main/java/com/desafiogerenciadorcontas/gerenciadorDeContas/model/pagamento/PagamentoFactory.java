package com.desafiogerenciadorcontas.gerenciadorDeContas.model.pagamento;

import com.desafiogerenciadorcontas.gerenciadorDeContas.Enum.RecebimentoAlugueis;
import com.desafiogerenciadorcontas.gerenciadorDeContas.model.usuario.ContasReceber;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PagamentoFactory {


    public CalculoPagamento calculoPagamento(LocalDate dataDeVencimento, LocalDate dataDeRecebimento) {
        if (dataDeVencimento.isBefore(dataDeRecebimento)) {
            return new PagamentoAtrasado();
        }
        if (dataDeVencimento.isAfter(dataDeRecebimento)) {
            return new PagamentoAdiantado();
        } else if (dataDeVencimento.equals(dataDeRecebimento)) {
            return new PagamentoEmDia();

        }

        return null;
    }
}
