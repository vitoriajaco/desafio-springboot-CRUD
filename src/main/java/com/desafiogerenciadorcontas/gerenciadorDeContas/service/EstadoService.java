package com.desafiogerenciadorcontas.gerenciadorDeContas.service;

import com.desafiogerenciadorcontas.gerenciadorDeContas.model.endereco.Estado;
import com.desafiogerenciadorcontas.gerenciadorDeContas.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> mostrarTodosEstados() {
        return estadoRepository.findAll();
    }

    public Optional<Estado>buscarPorId(Long estado_id){
        return estadoRepository.findById(estado_id);
    }

    public Estado cadastrarEstado (Estado estado){
        return estadoRepository.save(estado);
    }

    public Estado alterarEstado (Estado estado){
        estado.getId();
        estado.setNomeEstado(estado.getNomeEstado());
        return estadoRepository.save(estado);
    }

    public void deletarEstado (Long estado_id){
        estadoRepository.deleteById(estado_id);
    }
}
