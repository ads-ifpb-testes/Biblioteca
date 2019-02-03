package com.ifpb.biblioteca.model.Dao;

import com.ifpb.biblioteca.model.Entities.Cliente;
import com.ifpb.biblioteca.model.Entities.Livro;
import com.ifpb.biblioteca.model.Entities.Reserva;

import java.util.List;

public interface ReservaDAO {

    boolean reservarLivro(Livro livro, Cliente cliente);

    List<Reserva> listarResrevas();

    Reserva buscarPorLivro(Livro livro);

    boolean deletarReserva(int id);

}
