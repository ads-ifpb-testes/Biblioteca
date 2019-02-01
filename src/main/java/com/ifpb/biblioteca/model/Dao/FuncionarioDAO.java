package com.ifpb.biblioteca.model.Dao;

import com.ifpb.biblioteca.exceptions.DadosInvalidosException;
import com.ifpb.biblioteca.model.Entities.Funcionario;

public interface FuncionarioDAO {
    boolean cadastrar(Funcionario funcionario) throws DadosInvalidosException;

    boolean excluir(Funcionario funcionario);

    Funcionario buscar(Funcionario funcionario);

    boolean atualizar(int matricula, Funcionario funcionario);
}
