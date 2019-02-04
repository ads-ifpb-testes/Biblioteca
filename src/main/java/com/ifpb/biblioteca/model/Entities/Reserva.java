package com.ifpb.biblioteca.model.Entities;

import java.time.LocalDate;

public class Reserva {

    private static int codigo;
    private int id;
    private Livro livro;
    private Cliente cliente;
    private LocalDate dataDeReserva;

    public Reserva() {
    }

    public Reserva(Livro livro, Cliente cliente, LocalDate dataDeReserva) {
        this.id = ++codigo;
        this.livro = livro;
        this.cliente = cliente;
        this.dataDeReserva = dataDeReserva;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataDeReserva() {
        return dataDeReserva;
    }

    public void setDataDeReserva(LocalDate dataDeReserva) {
        this.dataDeReserva = dataDeReserva;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", livro=" + livro +
                ", cliente=" + cliente +
                ", dataDeReserva=" + dataDeReserva +
                '}';
    }
}
