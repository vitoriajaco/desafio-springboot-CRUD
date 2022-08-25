package com.desafiogerenciadorcontas.gerenciadorDeContas.model;

import com.desafiogerenciadorcontas.gerenciadorDeContas.Enum.Status;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class VerificaStatusConta {

    public Status processaStatus(LocalDate dataDeVencimento, LocalDateTime dataDePagamento) {

        if (dataDeVencimento.isBefore(LocalDate.now())) {
            return Status.VENCIDA;
        }

        if (dataDePagamento.isAfter(LocalDateTime.now())) {
            return Status.PAGO;

        }
        return Status.AGUARDANDO;

    }
}