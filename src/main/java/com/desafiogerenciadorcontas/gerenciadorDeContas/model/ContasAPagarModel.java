package com.desafiogerenciadorcontas.gerenciadorDeContas.model;


import com.desafiogerenciadorcontas.gerenciadorDeContas.Enum.Status;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Getter
@Setter
@Entity
@Table(name = "gerenciadorContas")
@NoArgsConstructor
@AllArgsConstructor
public class ContasAPagarModel {

    private Integer statusCodigo;


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

    public Status getStatusCodigo() throws IllegalAccessException {
        return Status.valueOf(statusCodigo);
    }

    public void setStatus(Status statusCodigo){
        if (statusCodigo!= null){
            this.statusCodigo = statusCodigo.getCodigoStatus();
        }
    }
}

