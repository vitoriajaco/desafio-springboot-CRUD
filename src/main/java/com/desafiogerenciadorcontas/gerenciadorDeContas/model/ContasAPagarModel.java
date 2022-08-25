package com.desafiogerenciadorcontas.gerenciadorDeContas.model;


import com.desafiogerenciadorcontas.gerenciadorDeContas.Enum.Status;
import com.desafiogerenciadorcontas.gerenciadorDeContas.Enum.Tipo;
import lombok.*;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Getter
@Setter
@Entity
@Table(name = "gerenciadorContas")
@NoArgsConstructor
@AllArgsConstructor
public class ContasAPagarModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column
    private String nome;

    @Column
    private LocalDate dataDeVencimento;

    @Column
    private LocalDateTime dataDePagamento;
    @Column
    private Double valor;

    @Column
    private Tipo tipo;

    private Status status;


    private static SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
}


