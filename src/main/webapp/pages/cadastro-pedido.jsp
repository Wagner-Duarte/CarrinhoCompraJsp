<%--
  Created by IntelliJ IDEA.
  User: Wagner
  Date: 24/10/2021
  Time: 09:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="head.jsp"/>
<body>
<form>
    <div class="page-wrapper">
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-6 mt-3">
                    <div class="card ">
                        <h4 class="card-title text-center mt-2">Cadastro de Pedido</h4>
                        <div class="card-body">
                            <div class="row  ">
                                <div class="col-sm-2 text-end">
                                    <label for="codcliente " class="text-end">Cod Cliente: </label>
                                </div>
                                <div class="col-8">
                                    <input type="text " class="form-control form-control-sm " id="codcliente " placeholder="Codigo cliente ">
                                </div>
                            </div>

                            <div class="row mt-2 ">
                                <div class="col-sm-2 text-end">
                                    <label for="cliente" class="text-end">Cliente: </label>
                                </div>
                                <div class="col-8">
                                    <input type="text" class="form-control form-control-sm " id="cliente" placeholder="Cliente">
                                </div>
                            </div>


                            <div class="row mt-2 ">
                                <div class="col-sm-2 text-end">
                                    <label for="datapedido" class="text-end">Data Pedido: </label>
                                </div>
                                <div class="col-8">
                                    <input type="text" class="form-control form-control-sm " id="datapedido" placeholder="Data Pedido">
                                </div>
                            </div>

                            <div class="row mt-2 ">
                                <div class="col-sm-2 text-end">
                                    <label for="numeropedido" class="text-end">Nun Pedido </label>
                                </div>
                                <div class="col-8">
                                    <input type="text" class="form-control form-control-sm " id="numeropedido" placeholder="Numero Pedido  de Nascimento">
                                </div>
                            </div>

                            <div class="row mt-2 ">
                                <div class="col-sm-2 text-end">
                                    <label for="itenspedido" class="text-end">Itens Pedido: </label>
                                </div>
                                <div class="col-8">
                                    <input type="text" class="form-control form-control-sm " id="itenspedido" placeholder="itens Pedido">
                                </div>
                            </div>

                            <div class="row mt-2 ">
                                <div class="col-sm-2 text-end">
                                    <label for="valortotal" class="text-end">Valor Total: </label>
                                </div>
                                <div class="col-8">
                                    <input type="text" class="form-control form-control-sm " id="valortotal" placeholder="Valor total">
                                </div>
                            </div>

                            <div class="row mt-2 ">
                                <div class="col-sm-2 text-end">
                                    <label for="valorfrete" class="text-end">Valot do Frete:</label>
                                </div>
                                <div class="col-8">
                                    <input type="text" class="form-control form-control-sm " id="valorfrete" placeholder="Valor do frete">
                                </div>
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
    </div>
</form>
<jsp:include page="scrpits.jsp"></jsp:include>

</body>
</html>
