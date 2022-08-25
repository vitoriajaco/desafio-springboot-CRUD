package com.desafiogerenciadorcontas.gerenciadorDeContas.controller;

import com.desafiogerenciadorcontas.gerenciadorDeContas.model.ContasAPagarModel;
import com.desafiogerenciadorcontas.gerenciadorDeContas.service.ContasAPagarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContasAPagarController {

    @Autowired
    private ContasAPagarService contasAPagarService;

    @GetMapping(path = "/contas")
    public List<ContasAPagarModel> mostrarTodasAsContas() {
        return contasAPagarService.mostrarTodasAsContas();
    }

    @GetMapping(path = "/contas/{codigo}")
    public Optional<ContasAPagarModel> buscarPorId(@PathVariable Long codigo) {
        return contasAPagarService.buscarPorId(codigo);
    }

    @PostMapping(path ="/conta")
    public ContasAPagarModel cadastarContas(@RequestBody ContasAPagarModel contasAPagarModel) {
        ContasAPagarModel conta = contasAPagarService.cadastrarContas(contasAPagarModel);
        return contasAPagarService.cadastrarContas(contasAPagarModel);
    }

    @PutMapping(path ="/conta/{codigo}")
    public ContasAPagarModel alterarContas(@RequestBody ContasAPagarModel contasAPagarModel) {
        ContasAPagarModel conta = contasAPagarService.alterarContas(contasAPagarModel);
        return contasAPagarService.alterarContas(contasAPagarModel);
    }

    @DeleteMapping(path = "/pagamento/{codigo}")
    public void deletar(@PathVariable Long codigo) {
        contasAPagarService.deletar(codigo);

    }
}

