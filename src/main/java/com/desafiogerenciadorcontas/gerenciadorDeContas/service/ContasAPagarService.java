package com.desafiogerenciadorcontas.gerenciadorDeContas.service;

import com.desafiogerenciadorcontas.gerenciadorDeContas.Enum.Status;
import com.desafiogerenciadorcontas.gerenciadorDeContas.Enum.Tipo;
import com.desafiogerenciadorcontas.gerenciadorDeContas.model.ContasAPagarModel;
import com.desafiogerenciadorcontas.gerenciadorDeContas.model.VerificaStatusConta;
import com.desafiogerenciadorcontas.gerenciadorDeContas.repository.ContasAPagarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ContasAPagarService {

    @Autowired
    private ContasAPagarRepository contasAPagarRepository;

    public List<ContasAPagarModel> mostrarTodasAsContas() {
        return contasAPagarRepository.findAll();
    }

    public Optional<ContasAPagarModel> buscarPorId(Long codigo) {
        return contasAPagarRepository.findById(codigo);
    }

    public ContasAPagarModel cadastrarContas(ContasAPagarModel contasAPagarModel) {
        contasAPagarModel.getCodigo();
        contasAPagarModel.getNome();
        contasAPagarModel.getValor();
        contasAPagarModel.getCodigoTipo();
        contasAPagarModel.getDataDeVencimento();
        //   contasAPagarModel.setDataDePagamento(LocalDateTime.now(contasAPagarModel.getDataDeVencimento()));
        return contasAPagarRepository.save(contasAPagarModel);
    }

    public ContasAPagarModel alterarContas(ContasAPagarModel contasAPagarModel){
        contasAPagarModel.getCodigo();
        contasAPagarModel.getNome();
        contasAPagarModel.getValor();
        contasAPagarModel.getCodigoTipo();
        contasAPagarModel.getDataDeVencimento();
        return contasAPagarRepository.save(contasAPagarModel);
    }


    public void deletar(Long codigo) {
        contasAPagarRepository.deleteById(codigo);
    }
}
//