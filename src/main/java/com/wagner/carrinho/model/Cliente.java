package com.wagner.carrinho.model;

import com.wagner.carrinho.core.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "cliente")
public class Cliente extends BaseEntity {

    private String nomeCompleto;
    private String cpf;
    private String endereco;
    private String cep;
    private String bairro;
    private String cidade;
    private String uf;
    private String telefone;
    private String nossa;

    public Cliente() {

    }

    public String getNossa() {
        return nossa;
    }

    public void setNossa(String nossa) {
        this.nossa = nossa;
    }

    public Cliente(Long id, String nomeCompleto, String cpf, String endereco, String cep, String bairro, String cidade, String uf, String telefone, String nossa) {
        super(id);
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.telefone = telefone;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
