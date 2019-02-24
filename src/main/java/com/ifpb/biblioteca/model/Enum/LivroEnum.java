package com.ifpb.biblioteca.model.Enum;

public enum LivroEnum {
    CONSULTA(1),
    EMPRESTIMO(2);

    private final int valor;
    LivroEnum(int valorOpcao){
        valor = valorOpcao;
    }
    public int getValor(){
        return valor;
    }
}
