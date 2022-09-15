package com.desafiogerenciadorcontas.gerenciadorDeContas.model.usuario;

import com.desafiogerenciadorcontas.gerenciadorDeContas.model.endereco.Endereco;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
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
    @Column( nullable = false)
    private Long id;
    @Column
    private String nomeUsuario;
    @Column
    private String dataNascimento;
    @Column(nullable = false)
    @Email(regexp=".+@.+\\..+")
    private String email;
    @Column(nullable = false)
    @Size(min = 11, max = 11)
    private String cpf;

    @JsonIgnore
    @OneToMany (mappedBy = "usuario_id", cascade = CascadeType.ALL)
    private List<Endereco> endereco_id = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "usuario_id", cascade = CascadeType.ALL)
    private List<ContasReceber> contasReceber = new ArrayList<>();
}
