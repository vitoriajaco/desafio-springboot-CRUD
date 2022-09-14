package com.desafiogerenciadorcontas.gerenciadorDeContas.model.usuario;

import com.desafiogerenciadorcontas.gerenciadorDeContas.model.endereco.Endereco;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "usuario")
public class UsuarioModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nomeUsuario;
    private Date dataNascimento;
    private String email;
    private String cpf;

    @JsonIgnore
    @OneToMany (mappedBy = "usuarioModel", cascade = CascadeType.ALL)
    private List<Endereco>enderecos = new ArrayList<>();

    //ele recebe o ContasAReceber nao esquecer
}
