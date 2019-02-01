package com.ifpb.biblioteca.model.Entities;

import java.time.LocalDate;

public class Funcionario {

    private int matricula;
    private String nome;
    private String senha;
    private String cpf;
    private LocalDate nascimento;

    public Funcionario(int matricula, String nome, String senha, String cpf, LocalDate nascimento) {
        this.matricula = matricula;
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", cpf='" + cpf + '\'' +
                ", nascimento=" + nascimento +
                '}';
    }
}
