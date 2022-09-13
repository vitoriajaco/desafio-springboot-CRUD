package com.desafiogerenciadorcontas.gerenciadorDeContas.controller;

import com.desafiogerenciadorcontas.gerenciadorDeContas.model.endereco.Estado;
import com.desafiogerenciadorcontas.gerenciadorDeContas.service.EnderecoService;
import com.desafiogerenciadorcontas.gerenciadorDeContas.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping(path= "/estado")
    public List<Estado>mostrarTodosEstados(){
        return estadoService.mostrarTodosEstados();
    }

    @GetMapping(path="/estado/{estado_id}" )
    public Optional<Estado>buscarPorId(@PathVariable Long estado_id){
        return estadoService.buscarPorId(estado_id);
    }

    @PostMapping(path = "/estado")
    @ResponseStatus(HttpStatus.CREATED)
    public Estado cadastrarEstado(@RequestBody Estado estado){
        return estadoService.cadastrarEstado(estado);
    }

    @PutMapping(path = "/estado/{estado_id}")
    public Estado alterarEstado(@RequestBody Estado estado){
        return estadoService.alterarEstado(estado);

    }

    @DeleteMapping(path = "/estado/{estado_id}")
    public void deletarEstado(@PathVariable Long estado_id){
        estadoService.deletarEstado(estado_id);
    }

}
