package com.senai.aula.repository;

import com.senai.aula.model.Funcionarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionariosRepository extends JpaRepository<Funcionarios, Long> {
    Optional<Funcionarios>findByemail(String email);
}