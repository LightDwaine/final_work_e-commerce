<%-- 
    Document   : listar
    Created on : 27 de out de 2023, 15:26:57
    Author     : leoomoreira
--%>

<%@page import="produto.modelo.Produto"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página de produtos</title>
    </head>
    <body>
        <h1>Produtos</h1>
        <%
            if (request.getAttribute("mensagem") != null) {
        %>
        <div><%= request.getAttribute("mensagem") %></div>
        <%
            }
        %>
        <% 
            List<Produto> produtos = (List<Produto>) request.getAttribute("produtos");
            if (produtos == null || produtos.isEmpty()) {
        %>
        <div>Não há produtos a serem listados.</div>
        <%
            } else {
        %>
        <table>
            <tr>
                <td>Id</td>
                <td>Nome</td>
                <td>&nbsp;</td>
            </tr>
            <% 
                for (Produto c : produtos) {
            %>
            <tr>
                <td><%= c.getId() %></td>
                <td><%= c.getDescricao() %></td>
                <td>
                    <a href="MostrarProduto?id=<%= c.getId() %>">Mostrar</a>
                    <a href="ExcluirProduto?id=<%= c.getId() %>">Excluir</a>
                </td>
            </tr>
            <%
                }
            %>
        </table>
        <%
            }
        %>
        <a href="NovoProduto">Novo produto</a>
    </body>
</html>
