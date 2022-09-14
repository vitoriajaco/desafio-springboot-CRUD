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
    private Long id;
    private String logradouro;
    private String bairro;
    private String cep;
    private String pontoReferencia;
    @ManyToOne
    @JoinColumn(name = "usuarioModel", referencedColumnName = "id")
    private UsuarioModel usuarioModel; // varios enderecos para um cliente
    @ManyToOne
    @JoinColumn (name = "cidade_id", referencedColumnName = "id")
    private Cidade cidade;

}
