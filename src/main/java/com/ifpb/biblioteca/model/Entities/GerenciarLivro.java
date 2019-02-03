package com.ifpb.biblioteca.model.Entities;

import com.ifpb.biblioteca.exceptions.DadosInvalidosException;
import com.ifpb.biblioteca.model.Dao.LivroDAO;

import java.util.ArrayList;
import java.util.List;

public class GerenciarLivro implements LivroDAO {
    private List<Livro> livros = new ArrayList<>();

    @Override
    public boolean cadastrar(String titulo, int codigo, String editora, String autor) throws DadosInvalidosException {
        return livros.add(new Livro(titulo,codigo,editora,autor));
    }

    @Override
    public boolean excluir(Livro livro) {
        return livros.remove(livro);
    }

    @Override
    public boolean atualizar(int codigo, Livro livro) {
        return false;
    }

    @Override
    public ArrayList<Livro> buscarPorTitulo(String titulo) {
        ArrayList<Livro> l = new ArrayList<>();
        for(Livro t : livros) {
            if(t.getTitulo().equals(titulo)) {
                l.add(t);
            }
        }
        return l;
    }
}
