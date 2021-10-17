package com.wagner.carrinho.model;

import com.wagner.carrinho.core.BaseEntity;

import java.math.BigDecimal;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "produto")
public class Produto extends BaseEntity {

    private String descricao;
    private String categoria;
    private BigDecimal valorUnitario;

    @OneToMany(mappedBy = "codigoDoProduto", fetch = FetchType.LAZY)
    private List<ItensPedido> itensPedidos;

    public Produto() {

    }

    public Produto(Long id, String descricao, String categoria, BigDecimal valorUnitario, List<ItensPedido> itensPedidos) {
        super(id);
        this.descricao = descricao;
        this.categoria = categoria;
        this.valorUnitario = valorUnitario;
        this.itensPedidos = itensPedidos;
    }

    public List<ItensPedido> getItensPedidos() {
        return itensPedidos;
    }

    public void setItensPedidos(List<ItensPedido> itensPedidos) {
        this.itensPedidos = itensPedidos;
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
