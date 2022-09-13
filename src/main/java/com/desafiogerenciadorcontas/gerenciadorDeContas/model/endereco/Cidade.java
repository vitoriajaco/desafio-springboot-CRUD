package com.desafiogerenciadorcontas.gerenciadorDeContas.model.endereco;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cidade_id;
    private String nomeCidade;
}
