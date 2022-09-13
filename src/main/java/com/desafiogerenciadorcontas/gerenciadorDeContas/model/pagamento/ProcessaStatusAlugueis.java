package com.desafiogerenciadorcontas.gerenciadorDeContas.model.pagamento;

import com.desafiogerenciadorcontas.gerenciadorDeContas.Enum.RecebimentoAlugueis;

import java.time.LocalDate;

public class ProcessaStatusAlugueis {

    public RecebimentoAlugueis processaStatusAlugueis(LocalDate dataDeRecebimento){
        if (dataDeRecebimento.isBefore(LocalDate.now())){
            return RecebimentoAlugueis.EM_ATRASO;
        }
        if (dataDeRecebimento.isAfter(LocalDate.now())){
            return RecebimentoAlugueis.ADIANTADO;
        } else {
            return RecebimentoAlugueis.EM_DIA;
        }
    }
}
