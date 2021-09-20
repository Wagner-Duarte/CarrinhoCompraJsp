package com.wagner.carrinho.dao;

import com.wagner.carrinho.model.Cliente;

import java.sql.PreparedStatement;

public class ClienteDao {

    public void salvar(Cliente cliente){
        try{
            String sql = "INSERT INTO cliente (nomeCompleto, cpf, endereco, cep, bairro, cidade, uf, telefone)";

        } catch (Exception e){
            e.printStackTrace();

        }


    }
}
