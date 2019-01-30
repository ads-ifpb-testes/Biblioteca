package com.ifpb.biblioteca.model;

public class Livro {

    private String nome;
    private int codigo;
    private String editora;
    private String autor;

    public Livro(String nome, int codigo, String editora, String autor) {
        this.nome = nome;
        this.codigo = codigo;
        this.editora = editora;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
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
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                ", editora='" + editora + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
