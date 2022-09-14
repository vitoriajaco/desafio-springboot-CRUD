package com.desafiogerenciadorcontas.gerenciadorDeContas.service;

import com.desafiogerenciadorcontas.gerenciadorDeContas.model.endereco.Cidade;
import com.desafiogerenciadorcontas.gerenciadorDeContas.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {
    @Autowired
    public CidadeRepository cidadeRepository;

    public List<Cidade> mostrarTodasAsCidades(){
        return cidadeRepository.findAll();
    }

    public Optional<Cidade> buscarPorId(Long cidade_id) {
        return cidadeRepository.findById(cidade_id);
    }

    public Cidade cadastarCidade (Cidade cidade){
        cidade.getId();
        cidade.getNomeCidade();
        return cidadeRepository.save(cidade);
    }

    public Cidade alterarCidade (Cidade cidade){
        cidade.getId();
        cidade.setNomeCidade(cidade.getNomeCidade());
        return cidadeRepository.save(cidade);
    }

    public void deletar (Long cidade_id){
        cidadeRepository.deleteById(cidade_id);
    }
}
