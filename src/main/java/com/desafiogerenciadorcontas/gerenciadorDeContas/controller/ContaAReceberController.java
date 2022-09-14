package com.desafiogerenciadorcontas.gerenciadorDeContas.controller;


import com.desafiogerenciadorcontas.gerenciadorDeContas.model.pagamento.PagamentoFactory;
import com.desafiogerenciadorcontas.gerenciadorDeContas.model.usuario.ContasReceber;
import com.desafiogerenciadorcontas.gerenciadorDeContas.service.ContasAReceberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContaAReceberController {

    @Autowired
    public ContasAReceberService contasAReceberService;

    @GetMapping(path = "/contaAReceber")
    public List<ContasReceber> mostrarTodasContas() {
        return contasAReceberService.mostrarTodasAsContas();
    }

    @GetMapping(path = "/contaAReceber/{contasAReceber_id}")
    public Optional<ContasReceber>buscarPorId(@PathVariable Long contasAReceber_id){
        return contasAReceberService.buscarPorId(contasAReceber_id);
    }

    @PostMapping(path = "/contaAReceber")
    @ResponseStatus(HttpStatus.CREATED)
    public ContasReceber cadastrar(@RequestBody ContasReceber contasReceber, PagamentoFactory pagamentoFactory){
        return contasAReceberService.cadastrarConta(contasReceber, pagamentoFactory );
    }

    @PutMapping(path = "/contaAReceber/{contasAReceber_id}")
       public ContasReceber alterar(@RequestBody ContasReceber contasReceber, PagamentoFactory pagamentoFactory){
        return contasAReceberService.alterarContas(contasReceber, pagamentoFactory );
    }

    @DeleteMapping(path = "/contaAReceber/{contasAReceber_id}")
    public void deletarConta(@PathVariable Long contasAReceber_id ) {
        contasAReceberService.deletar(contasAReceber_id);
    }

}
