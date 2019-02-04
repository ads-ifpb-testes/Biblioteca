package com.ifpb.biblioteca.model.Dao;


import com.ifpb.biblioteca.exceptions.LivroIndisponivelException;
import com.ifpb.biblioteca.model.Entities.Cliente;
import com.ifpb.biblioteca.model.Entities.Emprestimo;
import com.ifpb.biblioteca.model.Entities.Livro;

import java.util.List;

public interface EmprestimoDAO {

    boolean emprestar(Livro livro, Cliente cliente) throws LivroIndisponivelException;

    Emprestimo consultar(int id);

    boolean devolver(Emprestimo emprestimo);

    List<Emprestimo> listarEmprestimos();


}
