package com.desafiogerenciadorcontas.gerenciadorDeContas.model.usuario;

import com.desafiogerenciadorcontas.gerenciadorDeContas.Enum.TipoRecebimento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "contas_a_receber")
public class ContasReceber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contasAReceber_id;
    private String recebimento;
    private Long valorRecebimento;
    @Enumerated
    private TipoRecebimento tipoRecebimento;
    private Date dataDeVencimento;
    private Date dataDeRecebimento;
    private Long usuario_id;

}
