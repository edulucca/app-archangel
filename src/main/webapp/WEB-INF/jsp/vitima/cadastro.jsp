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
  <h2>Cadastramento de Vítima</h2>
  <form action="/vitima/incluir" method="POST">
    <div class="mb-3 mt-3">
        <label>Nome da Vítima:</label>
        <input type="text" class="form-control" placeholder="Entre com o nome da vítima" name="nome">
      </div>
    <div class="mb-3 mt-3">
      <label for="nomeDaMae">Nome da Mãe:</label>
      <input type="text" class="form-control" placeholder="Entre com o nome da mãe da vítima" name="nomeDaMae">
    </div>
    <div class="mb-3">
      <label for="idade">Idade da Vítima:</label>
      <input type="number" class="form-control" placeholder="Entre com a idade da vítima" name="idade">
    </div>

    <button type="submit" class="btn btn-primary">Cadastrar</button>
  </form>
</div>
</body>
</html>