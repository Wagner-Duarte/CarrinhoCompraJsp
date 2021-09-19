package com.wagner.teste.Model;

import java.math.BigDecimal;

public class Produto {

    private String descricao;
    private String categoria;
    private BigDecimal valorUnitario;


    public Produto(String descricao, String categoria, BigDecimal valorUnitario) {
        this.descricao = descricao;
        this.categoria = categoria;
        this.valorUnitario = valorUnitario;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
