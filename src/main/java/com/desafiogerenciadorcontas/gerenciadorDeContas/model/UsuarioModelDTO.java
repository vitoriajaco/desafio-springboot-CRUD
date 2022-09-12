package com.desafiogerenciadorcontas.gerenciadorDeContas.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioModelDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nomeUsuario;
    private Date dataNascimento;
    private String email;

    public Long getId() {
        return id;
    }


    }


