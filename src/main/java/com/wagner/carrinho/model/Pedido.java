package com.wagner.carrinho.model;

import com.wagner.carrinho.core.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * Aqui nessa classe o atributo ID é utilizado como NUMERO DO PEDIDO
 */


@Entity
@Table(name = "pedido")
public class Pedido extends BaseEntity {

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataDoPedido;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY)
    private List<ItensPedido> itensDoPedido;

    private BigDecimal valorTotal;
    private BigDecimal valorDoFrete;



    public Pedido() {

    }

    public Pedido(Long id, Date dataDoPedido, Cliente cliente, List<ItensPedido> itensDoPedido, BigDecimal valorTotal, BigDecimal valorDoFrete) {
        super(id);
        this.dataDoPedido = dataDoPedido;
        this.cliente = cliente;
        this.itensDoPedido = itensDoPedido;
        this.valorTotal = valorTotal;
        this.valorDoFrete = valorDoFrete;
    }


    public void calculaValorTotal (){

        this.valorTotal = new BigDecimal(0);
        for(ItensPedido itensPedido:itensDoPedido) {
            this.valorTotal = this.valorTotal.add(itensPedido.getValorTotal());
        }
    }



    public Date getDataDoPedido() {
        return dataDoPedido;
    }

    public void setDataDoPedido(Date dataDoPedido) {
        this.dataDoPedido = dataDoPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItensPedido> getItensDoPedido() {
        return itensDoPedido;
    }

    public void setItensDoPedido(List<ItensPedido> itensDoPedido) {
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
