package com.desafiogerenciadorcontas.gerenciadorDeContas.model.pagamento;

import com.desafiogerenciadorcontas.gerenciadorDeContas.Enum.RecebimentoAlugueis;
import com.desafiogerenciadorcontas.gerenciadorDeContas.model.usuario.ContasReceber;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PagamentoFactory {

    ContasReceber contasReceber;

    public CalculoPagamento calculoPagamento(LocalDate dataDeVencimento, LocalDateTime dataDeRecebimento) {
        if (dataDeVencimento.isBefore(dataDeRecebimento.toLocalDate())) {
            return new PagamentoAdiantado();
        }
        if (dataDeVencimento.isAfter(dataDeRecebimento.toLocalDate())) {
            return new PagamentoAtrasado();
        } else if (dataDeVencimento.equals(dataDeRecebimento.toLocalDate())) {
            return new PagamentoEmDia();

        }

        return null;
    }
}
