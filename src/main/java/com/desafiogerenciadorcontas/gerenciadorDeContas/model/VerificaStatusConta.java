package com.desafiogerenciadorcontas.gerenciadorDeContas.model;

import com.desafiogerenciadorcontas.gerenciadorDeContas.Enum.Status;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Date;

public class VerificaStatusConta {

    ContasAPagarModel contasAPagarModel;

    public Status VerificaStatusConta(LocalDate dataDeVencimento, LocalDateTime dataDePagamento) throws IllegalAccessException {
        Date agora = new Date();
        if (dataDeVencimento.isBefore(LocalDate.now())) {
            return Status.VENCIDA;
        }

        if (dataDePagamento.isAfter(LocalDateTime.now())) {
            return Status.PAGO;

        }
        return Status.AGUARDANDO;

    }
}