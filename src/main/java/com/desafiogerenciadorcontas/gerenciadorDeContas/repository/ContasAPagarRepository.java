package com.desafiogerenciadorcontas.gerenciadorDeContas.repository;

import com.desafiogerenciadorcontas.gerenciadorDeContas.model.ContasAPagarModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContasAPagarRepository extends JpaRepository<ContasAPagarModel, Long> {
}
