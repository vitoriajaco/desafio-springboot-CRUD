package com.desafiogerenciadorcontas.gerenciadorDeContas.controller;

import com.desafiogerenciadorcontas.gerenciadorDeContas.model.endereco.Endereco;
import com.desafiogerenciadorcontas.gerenciadorDeContas.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping(path="/endereco")
    public List<Endereco>mostrarTodosEnderecos(){
        return enderecoService.buscarTodosEnderecos();
    }

    @GetMapping(path="/endereco/{endereco_id}")
    public Optional<Endereco> buscarPorId(@PathVariable Long endereco_id){
        return enderecoService.buscarPorId(endereco_id);
    }

    @PostMapping(path="/endereco")
    @ResponseStatus(HttpStatus.CREATED)
    public Endereco cadastrarEndereco(@RequestBody Endereco endereco){
        return enderecoService.cadastrarEndereco(endereco);
    }

    @PutMapping(path="/endereco/{endereco_id}")
    public Endereco alterarEndereco(@RequestBody Endereco endereco){
        return enderecoService.alterar(endereco);
    }

    @DeleteMapping(path="/endereco/{endereco_id}")
    public void deletarEndereco(@PathVariable Long endereco_id){
        enderecoService.deletar(endereco_id);
    }

}
