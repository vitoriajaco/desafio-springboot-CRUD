package com.desafiogerenciadorcontas.gerenciadorDeContas.model;

import com.desafiogerenciadorcontas.gerenciadorDeContas.Enum.Status;
import com.desafiogerenciadorcontas.gerenciadorDeContas.Enum.Tipo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.text.SimpleDateFormat;
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


    @Getter
    @Setter
    @Entity
    @Table(name = "gerenciadorContas")
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ContasAPagarModel {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long codigo;

        @Column (length = 50, nullable = false)

        private String nome;

        @Column (nullable = false)
        private LocalDate dataDeVencimento;

        @Column
        private LocalDateTime dataDePagamento;
        @Column ( nullable = false)
        private Double valor;

        @Column (nullable = false)
        private Tipo tipo;

        @Enumerated
        private Status status;


        private static SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");



        }
}