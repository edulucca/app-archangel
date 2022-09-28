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

    <h2>Cadastramento de Requisitante</h2>
    <form action="/requisitante/incluir" method="POST">
        <div class="mb-3 mt-3">
            <label>Nome:</label>
            <input type="text" class="form-control" placeholder="Entre com seu nome" name="nome">
        </div>
        <div class="mb-3 mt-3">
            <label for="cpf">CPF:</label>
            <input type="text" class="form-control" maxlength="11" placeholder="Entre com seu CPF" name="cpf">
        </div>
        <div class="mb-3">
            <label for="telefone">Telefone:</label>
            <input type="tel" class="form-control" placeholder="Entre com seu número de telefone" name="telefone">
        </div>

        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>
</div>
</body>
</html>