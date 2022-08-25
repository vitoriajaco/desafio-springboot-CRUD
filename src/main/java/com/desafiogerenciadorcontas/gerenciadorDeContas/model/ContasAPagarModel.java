package com.desafiogerenciadorcontas.gerenciadorDeContas.model;


import com.desafiogerenciadorcontas.gerenciadorDeContas.Enum.Status;
import lombok.*;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;


@Getter
@Setter
@Entity
@Table(name = "gerenciadorContas")
@NoArgsConstructor
@AllArgsConstructor
public class ContasAPagarModel {

    private Integer statusCodigo;

    private Integer codigoTipo;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column
    private String statusDePagamento;
    @Column
    private String nome;
    @Column
    private Double valor;
    @Column
    private String tipoDePagamento;
    @Column
    private LocalDate dataDeVencimento;

    @Column
    private LocalDateTime dataDePagamento;
    //LocalDate.now();

    private static SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
    public ContasAPagarModel(String nome, Double valor, String tipoDePagamento, LocalDate dataDeVencimento, LocalDateTime dataDePagamento) {
        this.nome = nome;
        this.valor = valor;
        this.tipoDePagamento = tipoDePagamento;
        this.dataDeVencimento = dataDeVencimento;
        this.dataDePagamento = dataDePagamento;
    }



    public Status getStatusCodigo() throws IllegalAccessException {
        return Status.valueOf(statusCodigo);
    }

    public void setStatus(Status statusCodigo){
        if (statusCodigo!= null){
            this.statusCodigo = statusCodigo.getCodigoStatus();
        }
    }
}

