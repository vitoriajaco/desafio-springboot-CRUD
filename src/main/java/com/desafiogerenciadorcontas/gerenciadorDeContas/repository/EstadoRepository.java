package com.desafiogerenciadorcontas.gerenciadorDeContas.repository;

import com.desafiogerenciadorcontas.gerenciadorDeContas.model.endereco.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {
}
