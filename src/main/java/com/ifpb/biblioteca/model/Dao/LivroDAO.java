package com.ifpb.biblioteca.model.Dao;


import com.ifpb.biblioteca.exceptions.DadosInvalidosException;
import com.ifpb.biblioteca.model.Entities.Livro;

public interface LivroDAO {
    boolean cadastrar(Livro livro) throws DadosInvalidosException;

    boolean excluir(Livro livro);

    Livro buscar(Livro livro);

    boolean atualizar(int codigo, Livro livro);
}
