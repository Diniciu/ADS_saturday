package com.senai.ProjetoADS.repository;

import com.senai.ProjetoADS.model.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
