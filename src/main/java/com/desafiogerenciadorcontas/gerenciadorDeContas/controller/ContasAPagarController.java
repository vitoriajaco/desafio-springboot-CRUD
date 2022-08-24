package com.desafiogerenciadorcontas.gerenciadorDeContas.controller;

import com.desafiogerenciadorcontas.gerenciadorDeContas.model.ContasAPagarModel;
import com.desafiogerenciadorcontas.gerenciadorDeContas.service.ContasAPagarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ContasAPagarController {

    @Autowired
    private ContasAPagarService contasAPagarService;

    public List<ContasAPagarModel> mostrarTodasAsContas(){
        return contasAPagarService.mostrarTodasAsContas();
    }

    public Optional<ContasAPagarModel> buscarPorId(Long codigo){
        return contasAPagarService.buscarPorId(codigo);
    }
}
