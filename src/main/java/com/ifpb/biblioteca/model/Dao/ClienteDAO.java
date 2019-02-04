package com.ifpb.biblioteca.model.Dao;


import com.ifpb.biblioteca.exceptions.DadosInvalidosException;
import com.ifpb.biblioteca.model.Entities.Cliente;

import java.time.LocalDate;
import java.util.List;

public interface ClienteDAO {

    boolean cadastrar(String cpf, String nome, LocalDate nascimento, String email, String senha) throws DadosInvalidosException;

    boolean excluir(String email);

    Cliente buscar(String email);

    boolean atualizar(String email, Cliente cliente);

    List<String> buscarPendencias(String email,EmprestimoDAO emprestimoDAO);



}
