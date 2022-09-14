package com.desafiogerenciadorcontas.gerenciadorDeContas.service;

import com.desafiogerenciadorcontas.gerenciadorDeContas.Enum.Status;
import com.desafiogerenciadorcontas.gerenciadorDeContas.model.ContasAPagarModel;
import com.desafiogerenciadorcontas.gerenciadorDeContas.model.pagamento.PagamentoFactory;
import com.desafiogerenciadorcontas.gerenciadorDeContas.model.usuario.ContasReceber;
import com.desafiogerenciadorcontas.gerenciadorDeContas.repository.ContasAReceberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ContasAReceberService {

    @Autowired
    public ContasAReceberRepository contasAReceberRepository;

    public List<ContasReceber> mostrarTodasAsContas() {
        List<ContasReceber> lista = contasAReceberRepository.findAll();
        return lista;
    }

    public Optional<ContasReceber> buscarPorId(Long codigo) {
        return contasAReceberRepository.findById(codigo);
    }

    public ContasReceber cadastrarConta(ContasReceber contasReceber, PagamentoFactory pagamentoFactory){
        LocalDate agora = LocalDate.now();
        contasReceber.setDataDeRecebimento(agora);
            contasReceber.setValorRecebimento(pagamentoFactory.calculoPagamento(contasReceber.getDataDeVencimento(),
                    contasReceber.getDataDeRecebimento()).calcularValorDaConta(contasReceber.getValorRecebimento()));

      return contasAReceberRepository.save(contasReceber);
    }
    public ContasReceber alterarContas(ContasReceber contasReceber, PagamentoFactory pagamentoFactory){
        LocalDate agora = LocalDate.now();
        contasReceber.setDataDeRecebimento(agora);
        contasReceber.setValorRecebimento(pagamentoFactory.calculoPagamento(contasReceber.getDataDeVencimento(),
                contasReceber.getDataDeRecebimento()).calcularValorDaConta(contasReceber.getValorRecebimento()));
        return contasAReceberRepository.save(contasReceber);
    }
    public void deletar(Long codigo) {
        contasAReceberRepository.deleteById(codigo);
    }

}
