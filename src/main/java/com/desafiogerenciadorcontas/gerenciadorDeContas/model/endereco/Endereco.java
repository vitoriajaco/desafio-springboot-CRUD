package com.desafiogerenciadorcontas.gerenciadorDeContas.model.endereco;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long endereco_id;
    private String logradouro;
    private String bairro;
    private String cep;
    private String pontoReferencia;
}
