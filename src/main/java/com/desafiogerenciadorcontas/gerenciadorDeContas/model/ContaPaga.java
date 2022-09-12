package com.desafiogerenciadorcontas.gerenciadorDeContas.model;

import com.desafiogerenciadorcontas.gerenciadorDeContas.Enum.Status;
import lombok.*;


import java.time.LocalDateTime;


@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContaPaga {

    private Long codigo;
    private String nome;
    private Double valor;
    private Status status;



    }

