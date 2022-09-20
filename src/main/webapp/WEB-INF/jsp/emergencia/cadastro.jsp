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
    <h2>Cadastrar Emergência</h2>
    <form action="/emergencia/incluir" method="POST">

        <div class="mb-3 mt-3">
            <label>Localização:</label>
            <input type="text" class="form-control" placeholder="Entre com a localização da Emergência"
                   name="localizacao">
        </div>
        <div class="mb-3 mt-3">
            <label>Status:</label>
            <select class="form-select" name="status">
                <option>Prestes a Ocorrer</option>
                <option>Ocorrendo Agora</option>
                <option>Finalizada</option>
            </select>
        </div>

        <div class="mb-3 mt-3">
            <label>Requisitante:</label>
            <select class="form-select" name="status">
                <c:forEach var="r" items="${requisitantes}">
                    <option>${r.nome}</option>
                </c:forEach>
            </select>
        </div>

        <label>Crises:</label>
        <div class="mb-3 mt-3">
            <c:forEach var="c" items="${crises}">
                <div class="form-check">
                    <label class="form-check-label">
                        <input class="form-check-input" type="checkbox" name="crises"
                               value="${c}">${c.nome}</label>
                </div>
            </c:forEach>
        </div>
        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>
</div>
</body>
</html>