package com.ifpb.model;

public class Livro {
    private int referencia;
    private String titulo;
    private String autor;
    private String editora;
    private boolean disponibilidade;

    public Livro(int referencia, String titulo, String autor, String editora) {
        this.referencia = referencia;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.disponibilidade = true;
    }

    public int getReferencia() {
        return referencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
