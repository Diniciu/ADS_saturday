package com.senai.aula.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank(message = "Nome obrigatório.")
    private String nome;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "E-mail é obrigatório.")
    private String email;

    @Column(nullable = false)
    @NotBlank(message = "Senha é obrigatória.")
    @Size(min = 3, message = "Senha deve ter no mínimo 3 caracteres.")
    private String senha;

    public Usuario(Long id) {

    }

    public Usuario(Long id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
