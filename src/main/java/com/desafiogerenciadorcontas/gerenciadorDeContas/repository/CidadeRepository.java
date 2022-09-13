package com.desafiogerenciadorcontas.gerenciadorDeContas.repository;

import com.desafiogerenciadorcontas.gerenciadorDeContas.model.endereco.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
