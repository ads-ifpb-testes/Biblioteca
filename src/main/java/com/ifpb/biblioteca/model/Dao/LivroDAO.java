package com.ifpb.biblioteca.model.Dao;


import com.ifpb.biblioteca.exceptions.DadosInvalidosException;
import com.ifpb.biblioteca.model.Entities.Livro;

import java.util.ArrayList;

public interface LivroDAO {
    boolean cadastrar(String titulo, int codigo, String editora, String autor) throws DadosInvalidosException;

    boolean excluir(Livro livro);

    public ArrayList<Livro> buscarPorTitulo(String titulo);

    boolean atualizar(int codigo, Livro livro);
}
