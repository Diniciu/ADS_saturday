package com.senai.aula.controller;

import com.senai.aula.model.Funcionarios;
import com.senai.aula.repository.FuncionariosRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionariosController {

    private FuncionariosRepository funcionariosRepository;

    // Construtor

    public FuncionariosController(FuncionariosRepository funcionariosRepository){
        this.funcionariosRepository = funcionariosRepository;
    }

    @GetMapping
    public List<Funcionarios> listarTodos(){
        return funcionariosRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Funcionarios> salvar(@RequestBody Funcionarios funcionarios){
        funcionariosRepository.save(funcionarios);
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionarios);
    }

    @PutMapping
    public ResponseEntity<Funcionarios> atualizar(@RequestBody Funcionarios funcionarios){
        funcionariosRepository.save(funcionarios);
        return ResponseEntity.status(HttpStatus.OK).body(funcionarios);
    }

    @DeleteMapping("/id")
    public ResponseEntity<Void> excluir(@PathVariable long id){
        funcionariosRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}