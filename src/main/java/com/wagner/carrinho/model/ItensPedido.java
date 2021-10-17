package com.wagner.carrinho.model;

import com.wagner.carrinho.core.BaseEntity;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "itenspedido")
public class ItensPedido extends BaseEntity {


    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto codigoDoProduto;

    private BigDecimal valorTotal;
    private  int quantidade;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    public ItensPedido() {

    }


    public ItensPedido(Long id, Produto codigoDoProduto, BigDecimal valorTotal, int quantidade, Pedido pedido) {
        super(id);
        this.codigoDoProduto = codigoDoProduto;
        this.valorTotal = valorTotal;
        this.quantidade = quantidade;
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getCodigoDoProduto() {
        return codigoDoProduto;
    }

    public void setCodigoDoProduto(Produto codigoDoProduto) {
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
