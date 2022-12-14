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
    <p>Software para gerar alertas e gerenciar emergĂȘncias</p>

    <h3>Classe: Crise</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>escalaDeRisco</th>
            <th>nome</th>
            <th>descricao</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="c" items="${listagem}">
                <tr>
                    <td>${c.escalaDeRisco}</td>
                    <td>${c.nome}</td>
                    <td>${c.descricao}</td>
                    <td><a href="/crise/${c.id}/excluir">Excluir</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    
</div>
</body>
</html>