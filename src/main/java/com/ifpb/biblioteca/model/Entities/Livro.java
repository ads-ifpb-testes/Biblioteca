package com.ifpb.biblioteca.model.Entities;

public class Livro {

    private String titulo;
    private int codigo;
    private String editora;
    private String autor;


    private boolean disponivel;

    public Livro(String titulo, int codigo, String editora, String autor) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.editora = editora;
        this.autor = autor;
        this.disponivel = true;

    }

    public boolean isDisponivel() {return disponivel;}

    public void setDisponivel(boolean disponivel) {this.disponivel = disponivel;}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", codigo=" + codigo +
                ", editora='" + editora + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
