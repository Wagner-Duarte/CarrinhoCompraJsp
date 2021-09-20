package com.wagner.carrinho.model;

import com.wagner.carrinho.core.BaseEntity;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "itenspedido")
public class ItensPedido extends BaseEntity {

    private Long codigoDoProduto;
    private BigDecimal valorTotal;
    private  int quantidade;

    public ItensPedido() {

    }

    public ItensPedido(Long id, Long codigoDoProduto, BigDecimal valorTotal, int quantidade) {
        super(id);
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
