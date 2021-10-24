<%--
  Created by IntelliJ IDEA.
  User: Wagner
  Date: 04/10/2021
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<jsp:include page="head.jsp"/>

<body style="background-color: aliceblue;">

<form>
    <div class="page-wrapper">
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-6 mt-3">
                    <div class="card ">
                        <h4 class="card-title text-center mt-2">Cadastro de Cliente</h4>
                        <div class="card-body">
                            <div class="row  ">
                                <div class="col-sm-2 text-end">
                                    <label for="usuario " class="text-end">Usuário: </label>
                                </div>
                                <div class="col-8">
                                    <input type="text " class="form-control form-control-sm " id="usuario " placeholder="Usuário ">
                                </div>
                            </div>

                            <div class="row mt-2 ">
                                <div class="col-sm-2 text-end">
                                    <label for="senha " class="text-end">Senha: </label>
                                </div>
                                <div class="col-8">
                                    <input type="password" class="form-control form-control-sm " id="senha " placeholder="Senha ">
                                </div>
                            </div>

                            <div class="row mt-2 ">
                                <div class="col-sm-2 text-end">
                                    <label for="cpf" class="text-end">CPF: </label>
                                </div>
                                <div class="col-8">
                                    <input type="text" class="form-control form-control-sm " id="cpf" placeholder="CPF">
                                </div>
                            </div>

                            <div class="row mt-2 ">
                                <div class="col-sm-2 text-end">
                                    <label for="datanascimento" class="text-end">Data Nasc: </label>
                                </div>
                                <div class="col-8">
                                    <input type="text" class="form-control form-control-sm " id="datanascimento" placeholder="Data de Nascimento">
                                </div>
                            </div>

                            <div class="row mt-2 ">
                                <div class="col-sm-2 text-end">
                                    <label for="cep" class="text-end">CEP: </label>
                                </div>
                                <div class="col-8">
                                    <input type="text" class="form-control form-control-sm " id="cep" placeholder="Cep">
                                </div>
                            </div>

                            <div class="row mt-2 ">
                                <div class="col-sm-2 text-end">
                                    <label for="endereco" class="text-end">Endereço:</label>
                                </div>
                                <div class="col-8">
                                    <input type="text" class="form-control form-control-sm " id="endereco" placeholder="Endereço">
                                </div>
                            </div>

                            <div class="row mt-2 ">
                                <div class="col-sm-2 text-end">
                                    <label for="bairro" class="text-end">Bairro: </label>
                                </div>
                                <div class="col-8">
                                    <input type="text" class="form-control form-control-sm " id="bairro" placeholder="Bairro">
                                </div>
                            </div>

                            <div class="row mt-2 ">
                                <div class="col-sm-2 text-end">
                                    <label for="cidade" class="text-end">Cidade: </label>
                                </div>
                                <div class="col-8">
                                    <input type="text" class="form-control form-control-sm " id="cidade" placeholder="Cidade">
                                </div>
                            </div>

                            <div class="row mt-2 ">
                                <div class="col-sm-2 text-end">
                                    <label for="uf" class="text-end">UF: </label>
                                </div>
                                <div class="col-8">
                                    <input type="text" class="form-control form-control-sm " id="uf" placeholder="UF">
                                </div>
                            </div>
                            <div class="row mt-2 ">
                                <div class="col-sm-2 text-end">
                                    <label for="telefone" class="text-end">Telefone: </label>
                                </div>
                                <div class="col-8">
                                    <input type="text" class="form-control form-control-sm " id="telefone" placeholder="Telefone de Contato">
                                </div>
                            </div>

                            <div class="row mt-2 ">
                                <div class="col-sm-2 text-end">
                                    <label  class="text-end">Observações: </label>
                                </div>
                                <div class="col-8">
                                        <textarea class="form-control form-control-sm">

                                        </textarea>
                                </div>

                                <div class="d-flex align-items-center mt-3">
                                    <button type="button" class="btn btn-primary">Novo</button>
                                    <button type="button" class="btn btn-warning">Editar</button>
                                    <button type="button" class="btn btn-success">Salvar</button>
                                    <button type="button" class="btn btn-danger">Delete</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </div>


</form>

<jsp:include page="scrpits.jsp"></jsp:include>


</body>

</html>