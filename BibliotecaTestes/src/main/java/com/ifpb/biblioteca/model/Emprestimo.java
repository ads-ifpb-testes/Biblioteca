package com.ifpb.biblioteca.model;

import java.time.LocalDate;

public class Emprestimo {

    private static int codigo;

    private int id;
    private Livro livro;
    private Cliente cliente;
    private LocalDate dataEmprestimo;
    private LocalDate dataFinalDevolucao;

    public Emprestimo() {

    }

    public Emprestimo(int id, Livro livro, Cliente cliente, LocalDate dataEmprestimo, LocalDate dataFinalDevolucao) {
        this.id = id;
        this.livro = livro;
        this.cliente = cliente;
        this.dataEmprestimo = dataEmprestimo;
        this.dataFinalDevolucao = dataFinalDevolucao;
    }

    public static int getCodigo() {
        return codigo;
    }

    public static void setCodigo(int codigo) {
        Emprestimo.codigo = codigo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataFinalDevolucao() {
        return dataFinalDevolucao;
    }

    public void setDataFinalDevolucao(LocalDate dataFinalDevolucao) {
        this.dataFinalDevolucao = dataFinalDevolucao;
    }
}
