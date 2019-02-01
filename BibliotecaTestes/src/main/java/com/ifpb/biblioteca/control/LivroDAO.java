package com.ifpb.biblioteca.control;

import com.ifpb.biblioteca.exceptions.DadosInvalidosException;
import com.ifpb.biblioteca.model.Livro;

import java.util.List;

public interface LivroDAO {
    boolean cadastrar(Livro livro) throws DadosInvalidosException;

    boolean excluir(Livro livro);

    Livro buscar(Livro livro);

    boolean atualizar(int codigo, Livro livro);
}
