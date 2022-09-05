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

    <h3>Classe: Emergencia</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Localização</th>
            <th>Status</th>
            <th>DataHora</th>
            <th>Requisitante</th>
            <th>Crises</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="c" items="${listagem}">
                <tr>
                    <td>${c.id}</td>
                    <td>${c.getLocalizacao()}</td>
                    <td>${c.status}</td>
                    <td>${c.dataHora}</td>
                    <td>${c.getRequisitante().nome}</td>
                    <td>${c.crises.size()}</td>
                    <td><a href="/emergencia/${c.id}/excluir">Excluir</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    
</div>
</body>
</html>