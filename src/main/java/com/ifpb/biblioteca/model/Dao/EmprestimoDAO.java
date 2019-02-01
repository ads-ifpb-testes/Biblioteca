package com.ifpb.biblioteca.model.Dao;


import com.ifpb.biblioteca.exceptions.LivroIndisponivelException;
import com.ifpb.biblioteca.model.Entities.Cliente;
import com.ifpb.biblioteca.model.Entities.Livro;

public interface EmprestimoDAO {
    boolean emprestar(Livro livro, Cliente cliente) throws LivroIndisponivelException;

}
