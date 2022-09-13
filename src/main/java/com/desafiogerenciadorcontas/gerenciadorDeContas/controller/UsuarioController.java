package com.desafiogerenciadorcontas.gerenciadorDeContas.controller;

import com.desafiogerenciadorcontas.gerenciadorDeContas.model.usuario.UsuarioModel;
import com.desafiogerenciadorcontas.gerenciadorDeContas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(path ="/usuarios")
    public List<UsuarioModel> procurarTodosUsuarios(){
        return usuarioService.mostrarTodosUsuarios();
    }

    @PostMapping(path="/usuarios")
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioModel registrarUsuario(@RequestBody UsuarioModel usuarioModel){
        return usuarioService.cadastrarUsuario(usuarioModel);
    }

    @PutMapping(path = "/usuario/{usuario_id}")
    public UsuarioModel alterarUsuario(@RequestBody UsuarioModel usuarioModel){
        return usuarioService.alterarUsuarioModel(usuarioModel);
    }

    @DeleteMapping(path = "/usuario/{usuario_id}")
    public void deletarUsuario(@PathVariable Long usuario_id){
        usuarioService.deletar(usuario_id);
    }
}


