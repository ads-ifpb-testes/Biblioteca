package com.ifpb.biblioteca.model.Dao;

import com.ifpb.biblioteca.exceptions.LivroIndisponivelException;
import com.ifpb.biblioteca.model.Dao.EmprestimoDAO;
import com.ifpb.biblioteca.model.Entities.Cliente;
import com.ifpb.biblioteca.model.Entities.Emprestimo;
import com.ifpb.biblioteca.model.Entities.Livro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmprestimoDaoImpl implements EmprestimoDAO {
    private List<Emprestimo> emprestimos;

    public EmprestimoDaoImpl() {
        this.emprestimos = new ArrayList<>();
    }

    @Override
    public boolean emprestar(Livro livro, Cliente cliente) throws LivroIndisponivelException {
       Emprestimo emprestimo = new Emprestimo(livro, cliente);
       if(livro.isDisponivel()){
           emprestimos.add(emprestimo);
           livro.setDisponivel(false);
           System.out.println("A data para devolucao eh "+ emprestimo.getDataFinalDevolucao());
           return true;
       }
       else return false;
    }
    @Override
    public Emprestimo consultar(int id){
        for (Emprestimo emprestimo:emprestimos){
            if(Objects.equals(id,emprestimo.getId())){
                return emprestimo;
            }
        }return null;
    }

    @Override
    public boolean devolver(Emprestimo emprestimo) {
        if(emprestimo!=null){
            for(Emprestimo e:emprestimos){
                if(e.getId()==emprestimo.getId()){
                    emprestimos.remove(e);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public List<Emprestimo> listarEmprestimos() {
        return this.emprestimos;
    }
}
