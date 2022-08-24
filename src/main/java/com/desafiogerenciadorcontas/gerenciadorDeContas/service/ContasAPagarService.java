package com.desafiogerenciadorcontas.gerenciadorDeContas.service;

import com.desafiogerenciadorcontas.gerenciadorDeContas.model.ContasAPagarModel;
import com.desafiogerenciadorcontas.gerenciadorDeContas.repository.ContasAPagarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContasAPagarService {

    @Autowired
    private ContasAPagarRepository contasAPagarRepository;

    public List<ContasAPagarModel> mostrarTodasAsContas(){
        return contasAPagarRepository.findAll();
    }

    public Optional<ContasAPagarModel>buscarPorId(Long codigo){
        return contasAPagarRepository.findById(codigo);
    }

    public void deletar(Long codigo){
        contasAPagarRepository.deleteById(codigo);
    }
}
//