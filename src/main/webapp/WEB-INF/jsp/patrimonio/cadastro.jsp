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
    <h2>Cadastrar Patrimônio</h2>
    <form action="/patrimonio/incluir" method="POST">

        <c:import url="/WEB-INF/jsp/crise/cadastro.jsp"/>

        <div class="mb-3 mt-3">
            <label>Número de Patrimônios:</label>
            <input type="number" class="form-control" placeholder="Entre com o número de patrimônios" name="nrPatrimonio">
        </div>
        <div class="mb-3 mt-3">
            <label>Tipo de Patrimônio:</label>
            <input type="text" class="form-control" placeholder="Entre com o tipo de patrimônio (ex.: casa, carro, apartamento)" name="tipo">
        </div>

        <div class="mb-3 mt-3">
            <label>Agente de risco:</label>
            <input type="text" class="form-control" placeholder="Entre com o agente causador do incidente" name="agenteDeRisco">
        </div>

        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>
</div>
</body>
</html>