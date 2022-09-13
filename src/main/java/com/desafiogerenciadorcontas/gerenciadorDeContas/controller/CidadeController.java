package com.desafiogerenciadorcontas.gerenciadorDeContas.controller;

import com.desafiogerenciadorcontas.gerenciadorDeContas.model.endereco.Cidade;
import com.desafiogerenciadorcontas.gerenciadorDeContas.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @GetMapping(path = "/cidade")
    public List<Cidade> mostrarTodasCidades(){
        return cidadeService.mostrarTodasAsCidades();
    }

    @GetMapping(path = "/cidade/{cidade_id}")
    public Optional<Cidade>buscarPorId(@PathVariable Long cidade_id){
        return cidadeService.buscarPorId(cidade_id);
    }

    @PostMapping(path = "/cidade")
    @ResponseStatus(HttpStatus.CREATED)
    public Cidade cadastrarCidade(@RequestBody Cidade cidade){
        return cidadeService.cadastarCidade(cidade);
    }

    @PutMapping(path = "/cidade/{cidade_id}")
    public Cidade alterarCidade(@RequestBody Cidade cidade){
       return cidadeService.alterarCidade(cidade);
    }

    @DeleteMapping(path = "/cidade/{cidade_id}")
    public void deletarCidade(@PathVariable Long cidade_id){
        cidadeService.deletar(cidade_id);
    }
}
