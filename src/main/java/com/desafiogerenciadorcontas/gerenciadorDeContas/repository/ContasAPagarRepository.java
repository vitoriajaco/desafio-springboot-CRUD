package com.desafiogerenciadorcontas.gerenciadorDeContas.repository;

import com.desafiogerenciadorcontas.gerenciadorDeContas.model.VerificaStatusConta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContasAPagarRepository extends JpaRepository<VerificaStatusConta.ContasAPagarModel, Long> {
}
