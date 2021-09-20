package com.wagner.carrinho.model;

import com.wagner.carrinho.core.BaseEntity;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "pedido")
public class Pedido extends BaseEntity {

    private String dataDoPedido;
    private Long numeroDoPedido;
    private Long codigoDoCliente;
    private String itensDoPedido;
    private BigDecimal valorTotal;
    private BigDecimal valorDoFrete;


    public Pedido() {

    }

    public Pedido(Long id, String dataDoPedido, Long numeroDoPedido, Long codigoDoCliente, String itensDoPedido, BigDecimal valorTotal, BigDecimal valorDoFrete) {
        super(id);
        this.dataDoPedido = dataDoPedido;
        this.numeroDoPedido = numeroDoPedido;
        this.codigoDoCliente = codigoDoCliente;
        this.itensDoPedido = itensDoPedido;
        this.valorTotal = valorTotal;
        this.valorDoFrete = valorDoFrete;
    }

    public String getDataDoPedido() {
        return dataDoPedido;
    }

    public void setDataDoPedido(String dataDoPedido) {
        this.dataDoPedido = dataDoPedido;
    }

    public Long getNumeroDoPedido() {
        return numeroDoPedido;
    }

    public void setNumeroDoPedido(Long numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
    }

    public Long getCodigoDoCliente() {
        return codigoDoCliente;
    }

    public void setCodigoDoCliente(Long codigoDoCliente) {
        this.codigoDoCliente = codigoDoCliente;
    }

    public String getItensDoPedido() {
        return itensDoPedido;
    }

    public void setItensDoPedido(String itensDoPedido) {
        this.itensDoPedido = itensDoPedido;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getValorDoFrete() {
        return valorDoFrete;
    }

    public void setValorDoFrete(BigDecimal valorDoFrete) {
        this.valorDoFrete = valorDoFrete;
    }
}
