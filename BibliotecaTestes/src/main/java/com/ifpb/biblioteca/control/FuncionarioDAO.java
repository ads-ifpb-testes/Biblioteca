package com.ifpb.biblioteca.control;

import com.ifpb.biblioteca.exceptions.DadosInvalidosException;
import com.ifpb.biblioteca.model.Funcionario;

import java.util.List;

public interface FuncionarioDAO {
    boolean cadastrar(Funcionario funcionario) throws DadosInvalidosException;

    boolean excluir(Funcionario funcionario);

    Funcionario buscar(Funcionario funcionario);

    boolean atualizar(int matricula, Funcionario funcionario);
}
