package com.ifpb.biblioteca.model.Dao;

import com.ifpb.biblioteca.model.Entities.Cliente;
import com.ifpb.biblioteca.model.Entities.Livro;
import com.ifpb.biblioteca.model.Entities.Reserva;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ReservaDaoImpl implements ReservaDAO {

    private List<Reserva> reservas;

    public ReservaDaoImpl() {
        this.reservas = new ArrayList<>();
    }

    @Override
    public boolean reservarLivro(Livro livro, Cliente cliente) {
        if(livro!=null && cliente !=null){
            Reserva reserva = new Reserva(livro,cliente, LocalDate.now());
            for(Reserva r:reservas){
                if(Objects.equals(reserva.getCliente(),r.getCliente()) && Objects.equals(reserva.getLivro(),r.getLivro())){
                    return false;
                }
            }
            return reservas.add(reserva);
        }
        return false;
    }

    @Override
    public List<Reserva> listarResrevas() {
        return this.reservas;
    }

    @Override
    public Reserva buscarPorLivro(Livro livro) {
        if(livro !=null){
            for(Reserva resreva:reservas){
                if(resreva.getLivro().getCodigo()==livro.getCodigo()){
                    return resreva;
                }
            }
        }
        return null;
    }

    @Override
    public boolean deletarReserva(int id) {
        for(Reserva reserva:reservas){
            if(reserva.getId()==id){
                return reservas.remove(reserva);
            }
        }
        return false;
    }
}
