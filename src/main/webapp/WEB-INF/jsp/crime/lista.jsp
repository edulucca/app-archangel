<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
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

    <h3>Classe: Crime</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>nrVitimas</th>
            <th>nrSuspeitos</th>
            <th>armaBranca</th>
            <th>armaDeFogo</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="c" items="${listagem}">
                <tr>
                    <td>${c.id}</td>
                    <td>${c.nrVitimas}</td>
                    <td>${c.nrSuspeitos}</td>
                    <td>${c.armaBranca}</td>
                    <td>${c.armaDeFogo}</td>
                    <td><a href="/crime/${c.id}/excluir">Excluir</a></td>
                    <td><a href="/crime">Cadastrar</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    
</div>
</body>
</html>