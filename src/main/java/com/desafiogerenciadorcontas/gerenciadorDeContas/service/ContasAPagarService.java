package com.desafiogerenciadorcontas.gerenciadorDeContas.service;

import com.desafiogerenciadorcontas.gerenciadorDeContas.Enum.Status;
import com.desafiogerenciadorcontas.gerenciadorDeContas.model.ContaPaga;
import com.desafiogerenciadorcontas.gerenciadorDeContas.model.ContasAPagarModel;
import com.desafiogerenciadorcontas.gerenciadorDeContas.model.VerificaStatusConta;
import com.desafiogerenciadorcontas.gerenciadorDeContas.repository.ContasAPagarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ContasAPagarService {

    @Autowired
    private ContasAPagarRepository contasAPagarRepository;



    public List<ContaPaga> mostrarTodasAsContas() {
        List<ContasAPagarModel> lista = contasAPagarRepository.findAll();
        List<ContaPaga> listaConta = new ArrayList<>();
        for (ContasAPagarModel contasAPagarModel : lista){
            ContaPaga contaPaga = new ContaPaga();
            contaPaga.setCodigo(contasAPagarModel.getCodigo());
            contaPaga.setNome(contasAPagarModel.getNome());
            contaPaga.setValor(contasAPagarModel.getValor());
            contaPaga.setStatus(contasAPagarModel.getStatus());
            listaConta.add(contaPaga);
        }
        return listaConta;
    }

    public Optional<ContasAPagarModel> buscarPorId(Long codigo) {
        return contasAPagarRepository.findById(codigo);
    }

    public ContasAPagarModel cadastrarContas(ContasAPagarModel contasAPagarModel) {
        VerificaStatusConta verificaStatusConta = new VerificaStatusConta();
        Status status = verificaStatusConta.processaStatus(contasAPagarModel.getDataDeVencimento());
        contasAPagarModel.setStatus(status);
        return contasAPagarRepository.save(contasAPagarModel);
    }

    public ContasAPagarModel alterarContas(String status, Long codigo){
        Optional<ContasAPagarModel> contasAPagarModel = contasAPagarRepository.findById(codigo);
             if (status.contains("PAGO") ) {
                 contasAPagarModel.get().setStatus(Status.PAGO);
                 contasAPagarModel.get().setDataDePagamento(LocalDateTime.now());
                return contasAPagarRepository.save(contasAPagarModel.get());
        } else return null;

    }

    public void deletar(Long codigo) {

        contasAPagarRepository.deleteById(codigo);
    }


}
//