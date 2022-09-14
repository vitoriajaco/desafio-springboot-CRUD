package com.desafiogerenciadorcontas.gerenciadorDeContas.model.endereco;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Cidade implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cidade_id;
    private String nomeCidade;

    @ManyToOne
    private Estado estado;

    @JsonIgnore
    @OneToMany(mappedBy = "cidade", cascade = CascadeType.ALL)
    private List<Endereco> enderecos;
}
