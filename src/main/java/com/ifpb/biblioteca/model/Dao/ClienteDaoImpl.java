package com.ifpb.biblioteca.model.Dao;

import com.ifpb.biblioteca.model.Dao.ClienteDAO;
import com.ifpb.biblioteca.model.Entities.Cliente;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

public class ClienteDaoImpl implements ClienteDAO {
    private HashMap<String, Cliente> clientes = new HashMap<>();
    @Override
    public boolean cadastrar(String cpf, String nome, LocalDate nascimento, String email, String senha){
     if(clientes.put(email,new Cliente(cpf,nome,nascimento,email,senha))==null){
         return true;
     } else return false;
    }

    @Override
    public boolean excluir(String email) {
        if(clientes.remove(email)==null){
            return true;
        }else return false;
    }

    @Override
    public Cliente buscar(String cpf) {
        Cliente clienteBuscado = clientes.get(cpf);
        return clienteBuscado;
    }

    @Override
    public boolean atualizar(String cpf, Cliente cliente) {
        if(clientes.put(cpf,cliente)==null){
            return true;
        }else return false;
    }

    @Override
    public List<String> buscarPendencias(String cpf) {
        return null;
    }
}
