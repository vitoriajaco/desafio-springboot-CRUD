package com.desafiogerenciadorcontas.gerenciadorDeContas.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
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

    private String status;
    @Column
    private String nome;
    @Column
    private Double valor;
    @Column
    private String tipo;
    @Column
    private LocalDate dataDeVencimento;
    @Column
    private LocalDateTime dataDePagamento;
}
