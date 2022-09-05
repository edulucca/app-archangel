<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>App Archangel</title>
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">
    <h2>AppArchAngel</h2>
    <p>Software para gerar alertas e gerenciar emergências</p>

    <h3>Cadastramento de usuários</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Nome</th>
            <th>Email</th>
            <th>Senha</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="u" items="${listagem}">
                <tr>
                    <td>${u.nome}</td>
                    <td>${u.email}</td>
                    <td>${u.senha}</td>
                    <td><a href="/usuario/${u.email}/excluir">Excluir</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    
</div>
</body>
</html>