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
@Table(name = "Estado")
public class Estado implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uf;
    private String nomeEstado;

    @JsonIgnore
    @OneToMany(mappedBy = "estado", cascade = CascadeType.ALL)
    private List<Cidade> cidade;
}
