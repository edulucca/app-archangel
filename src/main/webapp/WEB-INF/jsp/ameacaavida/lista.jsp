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

    <h3>Classe: AmeacaAVida</h3>
    <h4><a href="/ameacaavida">Cadastrar</a></h4>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>nrVitimas</th>
            <th>tipoFerimento</th>
            <th>statusVitima</th>
            <th>Vítima</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="c" items="${listagem}">
            <tr>
                <td>${c.id}</td>
                <td>${c.nrVitima}</td>
                <td>${c.tipoFerimento}</td>
                <td>${c.statusVitima}</td>
                <td>${c.vitimas}</td>
                <td><a href="/ameacaavida/${c.id}/excluir">Excluir</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    
</div>
</body>
</html>