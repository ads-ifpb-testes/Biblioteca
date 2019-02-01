package com.ifpb.biblioteca.control;

import com.ifpb.biblioteca.exceptions.LivroIndisponivelException;
import com.ifpb.biblioteca.model.Cliente;
import com.ifpb.biblioteca.model.Livro;

public interface EmprestimoDAO {
    boolean emprestar(Livro livro, Cliente cliente) throws LivroIndisponivelException;

}
