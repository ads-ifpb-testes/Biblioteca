package com.ifpb.biblioteca.model.Dao;

import com.ifpb.biblioteca.exceptions.DadosInvalidosException;
import com.ifpb.biblioteca.model.Dao.LivroDAO;
import com.ifpb.biblioteca.model.Entities.Livro;
import com.ifpb.biblioteca.model.Enum.LivroEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LivroDaoImpl implements LivroDAO {
    private List<Livro> livros;

    public LivroDaoImpl() {
        this.livros = new ArrayList<>();
    }

    @Override
    public boolean cadastrar(String titulo, int codigo, String editora, String autor) throws DadosInvalidosException {
        return livros.add(new Livro(titulo,codigo,editora,autor, LivroEnum.EMPRESTIMO));
    }
    public boolean cadastrar(Livro livro){
        return livros.add(livro);
    }

    @Override
    public boolean excluir(Livro livro) {
        return livros.remove(livro);
    }

    @Override
    public boolean atualizar(int codigo, Livro livro) {
        Livro old = buscar(codigo);
        if(old!=null) {
            excluir(old);
            cadastrar(livro);
        }return false;
    }

    @Override
    public Livro buscar(int codigo) {
        for (Livro livro: livros){
            if(codigo == livro.getCodigo()){
                return livro;
            }
            }return null;
        }

    @Override
    public ArrayList<Livro> buscarPorTitulo(String titulo) {
        ArrayList<Livro> l = new ArrayList<>();
        for(Livro t : livros) {
            if(t.getTitulo().equals(titulo)) {
                l.add(t);
            }
        }
        return l;
    }
    }



