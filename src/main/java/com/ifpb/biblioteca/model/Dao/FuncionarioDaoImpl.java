package com.ifpb.biblioteca.model.Dao;

import com.ifpb.biblioteca.exceptions.DadosInvalidosException;
import com.ifpb.biblioteca.model.Dao.FuncionarioDAO;
import com.ifpb.biblioteca.model.Entities.Funcionario;

import java.time.LocalDate;
import java.util.HashMap;

public class FuncionarioDaoImpl implements FuncionarioDAO {
    private HashMap<Integer, Funcionario> funcionarios = new HashMap<>();
    @Override
    public boolean cadastrar(int matricula, String nome, String senha, String cpf, LocalDate nascimento) throws DadosInvalidosException {
        if(funcionarios.put(matricula,new Funcionario(matricula,nome,senha,cpf,nascimento))==null){
                return true;
            } else return false;
    }

    @Override
    public boolean excluir(int matricula) {
        if(funcionarios.remove(matricula)==null){
            return true;
        }else return false;

    }

    @Override
    public Funcionario buscar(int matricula) {
        Funcionario funcionarioBuscado = funcionarios.get(matricula);
        return funcionarioBuscado;
    }

    @Override
    public boolean atualizar(int matricula, Funcionario funcionario) {
        if(funcionarios.put(matricula,funcionario)==null){
            return true;
        }else return false;
    }

}
