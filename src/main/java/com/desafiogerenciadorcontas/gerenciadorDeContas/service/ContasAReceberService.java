package com.desafiogerenciadorcontas.gerenciadorDeContas.service;

import com.desafiogerenciadorcontas.gerenciadorDeContas.Enum.Status;
import com.desafiogerenciadorcontas.gerenciadorDeContas.model.pagamento.CalculoPagamento;
import com.desafiogerenciadorcontas.gerenciadorDeContas.model.pagamento.PagamentoFactory;
import com.desafiogerenciadorcontas.gerenciadorDeContas.model.usuario.ContasReceber;
import com.desafiogerenciadorcontas.gerenciadorDeContas.repository.ContasAReceberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class ContasAReceberService {

    @Autowired
    public ContasAReceberRepository contasAReceberRepository;

    public ContasReceber cadastrarConta(ContasReceber contasReceber, PagamentoFactory pagamentoFactory, CalculoPagamento calculoPagamento){
        LocalDate agora = LocalDate.now();
        if (contasReceber.getStatus().equals(Status.PAGO)){
            contasReceber.setDataDeRecebimento(LocalDateTime.from(agora));
            contasReceber.setValorRecebimento(pagamentoFactory.);

        }
    }

}
