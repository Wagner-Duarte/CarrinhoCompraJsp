package com.wagner.teste.Model;

import java.math.BigDecimal;

public class ItensPedido {

    private Long codigoDoProduto;
    private BigDecimal valorTotal;
    private  int quantidade;

    public ItensPedido(Long codigoDoProduto, BigDecimal valorTotal, int quantidade) {
        this.codigoDoProduto = codigoDoProduto;
        this.valorTotal = valorTotal;
        this.quantidade = quantidade;
    }

    public Long getCodigoDoProduto() {
        return codigoDoProduto;
    }

    public void setCodigoDoProduto(Long codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
