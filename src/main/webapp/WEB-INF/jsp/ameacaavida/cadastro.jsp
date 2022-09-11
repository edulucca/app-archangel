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
    <h2>Cadastrar Ameaça a Vida</h2>
    <form action="/ameacaavida/incluir" method="POST">
        <div class="mb-3 mt-3">
            <label>Número de Vítimas:</label>
            <input type="number" class="form-control" placeholder="Entre com o número de vítimas" name="nrVitima">
        </div>

        <div class="mb-3 mt-3">
            <label>Ferimento:</label>
            <input type="text" class="form-control" placeholder="Entre com o ferimento da vítima" name="tipoFerimento">
        </div>

        <div class="mb-3 mt-3">
            <label>Estado da Vítima:</label>
            <select class="form-select" name="statusVitimaItem">
                <option selected>Open this select menu</option>
                <option value="Acordada">Acordada</option>
                <option value="Desacordada">Desacordada</option>
                <option value="Em Choque">Em Choque</option>
                <option value="Sem Sinais Vitais">Sem Sinais Vitais</option>
            </select>
        </div>

        <div class="mb-3 mt-3" >
            <label>Vítima:</label>
            <select class="form-select" name="idVitima">
                <option selected>Open this select menu</option>
                <c:forEach var="v" items="${vitima}">
                    <option value="${v.id}">${v}</option>
                </c:forEach>
            </select>

            <button type="submit" class="btn btn-primary">Cadastrar</button>
        </div>

    </form>
</div>
</body>
</html>