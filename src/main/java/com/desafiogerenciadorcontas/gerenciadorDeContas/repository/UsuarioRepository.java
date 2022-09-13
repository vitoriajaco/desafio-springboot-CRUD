package com.desafiogerenciadorcontas.gerenciadorDeContas.repository;

import com.desafiogerenciadorcontas.gerenciadorDeContas.model.usuario.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

}
