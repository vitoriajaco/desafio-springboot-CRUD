package com.desafiogerenciadorcontas.gerenciadorDeContas.model.usuario;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long usuario_id;
    private String nomeUsuario;
    private Date dataNascimento;
    private String email;
    private String cpf;
}
