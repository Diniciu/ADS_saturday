package com.example.aula.controller;

import com.example.aula.model.Usuario;
import com.example.aula.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UsuarioController {
    UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/")
    public String exibirFormulario(Model model){
        model.addAttribute("usuario", new Usuario());
        return "cadastro";
    }

    @PostMapping("/")
    public String cadastrarUsuario(Usuario usuario){
        usuarioService.salvar(usuario);
        return "redirect:/";
    }

    @GetMapping("/lista")
    public String listarUsuarios(Model model){
        List<Usuario> usuarios = usuarioService.listarTodos();
        model.addAttribute("usuarios", usuarios);
        return "lista";
    }
}