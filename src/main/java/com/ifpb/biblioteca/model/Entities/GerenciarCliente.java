package com.ifpb.biblioteca.model.Entities;

import com.ifpb.biblioteca.model.Dao.ClienteDAO;

import java.util.ArrayList;
import java.util.List;

public class GerenciarCliente implements ClienteDAO {
    private List<Cliente> clientes = new ArrayList<>();
    @Override
    public boolean cadastrar(Cliente cliente){
        return false;
    }

    @Override
    public boolean excluir(String cpf) {
        return false;
    }

    @Override
    public Cliente buscar(String cpf) {
        return null;
    }

    @Override
    public boolean atualizar(String cpf, Cliente cliente) {
        return false;
    }

    @Override
    public List<String> buscarPendencias(String cpf) {
        return null;
    }
}
