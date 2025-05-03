package com.senai.aula.service;

import com.senai.aula.model.Usuario;
import com.senai.aula.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public List <Usuario> listarTodos(){
        return usuarioRepository.findAll();
    }

    public Usuario salvar(@Valid Usuario usuario){
        if (usuarioRepository.findByEmail(usuario.getEmail()).isPresent()){
            throw new IllegalArgumentException("Usuário já cadastrado.");
        }
        return usuarioRepository.save(usuario);
    }
}
