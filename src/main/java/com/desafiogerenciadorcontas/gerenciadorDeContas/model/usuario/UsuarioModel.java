package com.desafiogerenciadorcontas.gerenciadorDeContas.model.usuario;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long codigo;
    private String nomeUsuario;
    private Date dataNascimento;
    private String email;
    private String cpf;
}
