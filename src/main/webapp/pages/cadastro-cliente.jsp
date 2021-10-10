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

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    <title>Formulario Clientes</title>
</head>

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
                                    <label for="obervacoes" class="text-end">Observações: </label>
                                </div>
                                <div class="col-8">
                                        <textarea class="form-control form-control-sm">

                                        </textarea>
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





<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js " integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ " crossorigin="anonymous "></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js " integrity="sha384-W8fXfP3gkOKtndU4JGtKDvXbO53Wy8SZCQHczT5FMiiqmQfUpWbYdTil/SxwZgAN " crossorigin="anonymous "></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.min.js " integrity="sha384-skAcpIdS7UcVUC05LJ9Dxay8AXcDYfBJqt1CJ85S/CFujBsIzCIv+l9liuYLaMQ/ " crossorigin="anonymous "></script>
</body>

</html>