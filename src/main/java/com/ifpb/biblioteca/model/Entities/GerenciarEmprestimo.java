package com.ifpb.biblioteca.model.Entities;

import com.ifpb.biblioteca.exceptions.LivroIndisponivelException;
import com.ifpb.biblioteca.model.Dao.EmprestimoDAO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GerenciarEmprestimo implements EmprestimoDAO {
    private List<Emprestimo> emprestimos = new ArrayList<>();
    @Override
    public boolean emprestar(Livro livro, Cliente cliente) throws LivroIndisponivelException {
        return emprestimos.add(new Emprestimo(livro, cliente));
    }
}
