package com.desafiogerenciadorcontas.gerenciadorDeContas.service;

import com.desafiogerenciadorcontas.gerenciadorDeContas.model.endereco.Endereco;
import com.desafiogerenciadorcontas.gerenciadorDeContas.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

//    public List<Endereco> buscarTodos(){
//        return enderecoRepository.findAll();
//    }
//
//    public Optional<Endereco> buscarId(Integer codigo){
//        return enderecoRepository.findById(codigo);
//    }
//
//    public Endereco cadastrar(Endereco endereco){
//        final S save = enderecoRepository.save(endereco);
//        return save;
//    }
//
//    public Endereco alterar(Endereco endereco){
//        endereco.getCodigo();
//        endereco.getLogradouro();
//        endereco.getCliente();
//
//        return enderecoRepository.save(enderec);
//    }
//
//    public void deletar(Integer codigo){
//        enderecoRepository.deleteById(codigo);
//    }
//
//    public List<Endereco> getBuscaeEnderecos(){
//        return enderecoRepository.getClienteEnderecos();
//    }
}

