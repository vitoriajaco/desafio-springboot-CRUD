package com.desafiogerenciadorcontas.gerenciadorDeContas.model.usuario;

import com.desafiogerenciadorcontas.gerenciadorDeContas.Enum.TipoRecebimento;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "contas_a_receber")
public class ContasReceber implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contasAReceber_id;
    @Column
    private String recebimento;
    @Column
    private Long valorRecebimento;
    @Enumerated
    @Column @NotNull
    private TipoRecebimento tipoRecebimento;
    @Column @NotNull
    private Date dataDeVencimento;
    @Column
    private Date dataDeRecebimento;
    @Column
    private Long usuario_id;

}
