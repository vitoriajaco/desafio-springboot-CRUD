package com.desafiogerenciadorcontas.gerenciadorDeContas.repository;

import com.desafiogerenciadorcontas.gerenciadorDeContas.model.usuario.ContasReceber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContasAReceberRepository extends JpaRepository<ContasReceber, Long> {
}
