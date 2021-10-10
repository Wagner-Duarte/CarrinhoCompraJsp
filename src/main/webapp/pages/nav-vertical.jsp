<%--
  Created by IntelliJ IDEA.
  User: Wagner
  Date: 04/10/2021
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<nav id="sidebar">
    <div class="sidebar-header">
        <h3>Menu Sistema</h3>
    </div>

    <ul class="list-unstyled components">
        <p>Ponto1</p>
        <li class="active">
            <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Cadastro</a>
            <ul class="collapse list-unstyled" id="homeSubmenu">
                <li>
                    <a href="#">Usuarios</a>
                </li>
                <li>
                    <a href="#">Clientes</a>
                </li>
                <li>
                    <a href="#">Produtos</a>
                </li>
            </ul>
        </li>
        <li>
            <a href="#">Pedidos</a>
        </li>

        <li>
            <a href="#">Itens Pedidos</a>
        </li>
        <li>
            <a href="#">Sair do Sistema</a>
        </li>
    </ul>


</nav>
</html>
