package com.desafiogerenciadorcontas.gerenciadorDeContas.model.usuario;

import com.desafiogerenciadorcontas.gerenciadorDeContas.Enum.TipoRecebimento;
import lombok.Data;

import java.util.Date;

public class ContasReceber {

    private Long contasAReceber_id;
    private String recebimento;
    private Long valorRecebimento;
    private TipoRecebimento tipoRecebimento;
    private Date dataDeVencimento;
    private Date dataDeRecebimento;
    private Long usuario_id;

}
