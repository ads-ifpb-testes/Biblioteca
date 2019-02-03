package com.ifpb.biblioteca.model.Dao;

import com.ifpb.biblioteca.exceptions.DadosInvalidosException;
import com.ifpb.biblioteca.model.Entities.Funcionario;

import java.time.LocalDate;

public interface FuncionarioDAO {
    boolean cadastrar(int matricula, String nome, String senha, String cpf, LocalDate nascimento) throws DadosInvalidosException;

    boolean excluir(int matricula);

    Funcionario buscar(int matricula);

    boolean atualizar(int matricula, Funcionario funcionario);
}
