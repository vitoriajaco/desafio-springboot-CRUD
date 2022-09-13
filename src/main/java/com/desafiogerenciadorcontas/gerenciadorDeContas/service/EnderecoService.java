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

    public Optional<Endereco> buscarPorId(Long endereco_id) {
        return enderecoRepository.findById(endereco_id);
    }

    public List<Endereco> buscarTodosEnderecos() {
        return enderecoRepository.findAll();
    }

    public Endereco cadastrarEndereco(Endereco endereco) {
    endereco.getEndereco_id();
    endereco.getLogradouro();
    endereco.getBairro();
    endereco.getPontoReferencia();
    endereco.getCep();
        return enderecoRepository.save(endereco);
    }
    public Endereco alterar(Endereco endereco) {
    endereco.getEndereco_id();
    endereco.setBairro(endereco.getBairro());
    endereco.setLogradouro(endereco.getLogradouro());
    endereco.setPontoReferencia(endereco.getPontoReferencia());
    endereco.setCep(endereco.getCep());
    return enderecoRepository.save(endereco);

    }
    public void deletar(Long endereco_id) {
        enderecoRepository.deleteById(endereco_id);
    }

}
