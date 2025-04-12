package com.senai.aula.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tabela-funcionarios")
public class Funcionarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    @Column (nullable = false)
    private String name;

    @Column (nullable = false)
    private String email;

    @Column (nullable = false)
    private int matricula;

    @Column (nullable = false)
    private double cpf;

    public Funcionarios() {

    }

    public Funcionarios(long id, String name, String email, int matricula, double cpf) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.matricula = matricula;
        this.cpf = cpf;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }
}