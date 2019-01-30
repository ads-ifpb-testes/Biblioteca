package com.ifpb.biblioteca.control;

import com.ifpb.biblioteca.model.Cliente;

import java.util.List;

public interface ClienteDAO {

    boolean cadastrar(Cliente cliente);

    boolean excluir(String cpf);

    Cliente buscar(String cpf);

    boolean atualizar(String cpf, Cliente cliente);

    List<String> buscarPendencias(String cpf);



}
