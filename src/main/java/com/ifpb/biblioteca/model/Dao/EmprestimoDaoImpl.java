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
    public boolean emprestar(Livro livro, String email, ClienteDAO dao) throws LivroIndisponivelException {
        if(livro!=null && email!=""){
            if(livro.isDisponivel()){
                if(dao.buscar(email)!=null){
                    Emprestimo emprestimo = new Emprestimo(livro,dao.buscar(email));
                    livro.setDisponivel(false);
                    System.out.println("A data para devolucao eh "+ emprestimo.getDataFinalDevolucao());
                    return true;
                }
            }
            else throw new LivroIndisponivelException();
        }
        return false;
    }

    @Override
    public Emprestimo consultar(int id){
        for (Emprestimo emprestimo:emprestimos){
            if(id == emprestimo.getId()){
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

    @Override
    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }
}
