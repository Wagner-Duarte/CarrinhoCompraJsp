package com.wagner.carrinho.enums;

public enum Uf {

    AM("AM", "Amazonas"),
    SP("SP", "São Paulo");


    private String sigla;
    private String nome;

    Uf(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

}
