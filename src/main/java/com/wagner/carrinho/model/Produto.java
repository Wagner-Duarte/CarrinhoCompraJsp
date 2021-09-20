package com.wagner.carrinho.model;

import com.wagner.carrinho.core.BaseEntity;

import java.math.BigDecimal;


import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "produto")
public class Produto extends BaseEntity {

    private String descricao;
    private String categoria;
    private BigDecimal valorUnitario;


    public Produto() {

    }

    public Produto(Long id, String descricao, String categoria, BigDecimal valorUnitario) {
        super(id);
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
