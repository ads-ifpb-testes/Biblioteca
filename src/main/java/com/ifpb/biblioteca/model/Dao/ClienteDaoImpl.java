package com.ifpb.biblioteca.model.Dao;

import com.ifpb.biblioteca.model.Dao.ClienteDAO;
import com.ifpb.biblioteca.model.Entities.Cliente;
import com.ifpb.biblioteca.model.Entities.Emprestimo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteDaoImpl implements ClienteDAO {
    private Map<String, Cliente> clientes;

    public ClienteDaoImpl(Map<String, Cliente> clientes) {
        this.clientes = new HashMap<>();
    }

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
    public List<String> buscarPendencias(String cpf,EmprestimoDAO emprestimoDAO) {
        List<Emprestimo> emprestimos= emprestimoDAO.listarEmprestimos();
        if(emprestimos.equals(new ArrayList<>())){
            return new ArrayList<String>();
        }else{
            List<String> pendencias = new ArrayList<>();
            for(Emprestimo emprestimo:emprestimos){
                if(emprestimo.getCliente().getCpf().equals(cpf)){
                    pendencias.add("Pendencias realionada ao livro "+emprestimo.getLivro().getTitulo()+
                            " de código "+emprestimo.getLivro().getCodigo());
                }
            }
            return pendencias;
        }
    }
}
