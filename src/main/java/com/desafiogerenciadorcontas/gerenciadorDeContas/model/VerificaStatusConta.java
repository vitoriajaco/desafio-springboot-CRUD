package com.desafiogerenciadorcontas.gerenciadorDeContas.model;

import com.desafiogerenciadorcontas.gerenciadorDeContas.Enum.Status;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class VerificaStatusConta {

    public Status processaStatus(LocalDate dataDeVencimento) {

        if (dataDeVencimento.isBefore(LocalDate.now())) {
            return Status.VENCIDA;
        } else {
            return Status.AGUARDANDO;
        }

    }

}