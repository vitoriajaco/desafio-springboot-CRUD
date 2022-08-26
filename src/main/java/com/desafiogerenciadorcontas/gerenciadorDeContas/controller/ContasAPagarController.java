package com.desafiogerenciadorcontas.gerenciadorDeContas.controller;

import com.desafiogerenciadorcontas.gerenciadorDeContas.Enum.Status;
import com.desafiogerenciadorcontas.gerenciadorDeContas.model.ContaPaga;
import com.desafiogerenciadorcontas.gerenciadorDeContas.model.ContasAPagarModel;
import com.desafiogerenciadorcontas.gerenciadorDeContas.service.ContasAPagarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContasAPagarController {

    @Autowired
    private ContasAPagarService contasAPagarService;

    @GetMapping(path = "/contas")
    public ResponseEntity<List<ContaPaga>> mostrarTodasAsContas() {
        List<ContaPaga> lista = contasAPagarService.mostrarTodasAsContas();
        return  ResponseEntity.ok(contasAPagarService.mostrarTodasAsContas());
    }

    @GetMapping(path = "/contas/{codigo}")
    public ResponseEntity<Optional<ContasAPagarModel>>buscarPorId(@PathVariable Long codigo) {
        return ResponseEntity.ok(contasAPagarService.buscarPorId(codigo));
    }

    @PostMapping(path ="/contas")
    public ContasAPagarModel cadastarContas(@RequestBody ContasAPagarModel contasAPagarModel) {
        ContasAPagarModel conta = contasAPagarService.cadastrarContas(contasAPagarModel);
        return contasAPagarService.cadastrarContas(contasAPagarModel);
    }

    @PutMapping(path ="/contas/{codigo}")
    public ResponseEntity<ContasAPagarModel> alterarContas(@PathVariable Long codigo, @RequestBody ContasAPagarModel contasAPagarModel, ContaPaga contapaga) {
        return ResponseEntity.ok(contasAPagarService.alterarContas(contasAPagarModel, codigo));
    }

    @DeleteMapping(path = "/contas/{codigo}")
    public void deletar(@PathVariable Long codigo) {
        contasAPagarService.deletar(codigo);

    }
}

