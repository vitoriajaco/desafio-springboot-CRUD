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

    @Column
    private String logradouro;

    @Column
    private String bairro;

    @Column
    private String cep;

    @Column
    private String pontoReferencia;
    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private UsuarioModel usuario_id; // varios enderecos para um cliente
    @ManyToOne
    @JoinColumn (name = "cidade_id", referencedColumnName = "id")
    private Cidade cidade_id;

}
