package com.desafiogerenciadorcontas.gerenciadorDeContas.model.endereco;


import com.desafiogerenciadorcontas.gerenciadorDeContas.model.usuario.UsuarioModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "endereco")
public class Endereco implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long endereco_id;
    private String logradouro;
    private String bairro;
    private String cep;
    private String pontoReferencia;

    @ManyToOne
    private UsuarioModel usuarioModel;

    @ManyToOne
    private Cidade cidade;

}
