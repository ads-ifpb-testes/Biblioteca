package com.ifpb.biblioteca.control;

import com.ifpb.biblioteca.exceptions.DadosInvalidosException;
import com.ifpb.biblioteca.model.Cliente;

import java.util.List;

public interface ClienteDAO {

    boolean cadastrar(Cliente cliente) throws DadosInvalidosException;

    boolean excluir(String cpf);

    Cliente buscar(String cpf);

    boolean atualizar(String cpf, Cliente cliente);

    List<String> buscarPendencias(String cpf);



}
