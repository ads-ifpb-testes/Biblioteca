package com.ifpb.biblioteca.exceptions;

public class DadosInvalidosException extends Exception{
    public DadosInvalidosException() {
        super("Dados inválidos para cadastro!");
    }
}
