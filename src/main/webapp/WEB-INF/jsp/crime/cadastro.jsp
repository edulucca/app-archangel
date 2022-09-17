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
  <h2>Cadastrar Crime</h2>
  <form action="/crime/incluir" method="POST">

    <c:import url="/WEB-INF/jsp/crise/cadastro.jsp"/>

    <div class="mb-3 mt-3">
        <label>Número de Vítimas:</label>
        <input type="number" class="form-control" placeholder="Entre com o número de vítimas" name="nrVitimas">
      </div>
    <div class="mb-3 mt-3">
      <label>Número de Suspeitos:</label>
      <input type="number" class="form-control" placeholder="Entre com o número de suspeitos" name="nrSuspeitos">
    </div>

    <label for="armaBranca" class="form-check-label">Arma Branca</label>
    <div class="form-check">
      <input type="radio" class="form-check-input" name="armaBranca" value="true">Sim
    </div>
    <div class="form-check">
      <input type="radio" class="form-check-input" name="armaBranca" value="false">Não
    </div>

    <label for="armaDeFogo" class="form-check-label">Arma de Fogo</label>
    <div class="form-check">
      <input type="radio" class="form-check-input" name="armaDeFogo" value="true">Sim
    </div>
    <div class="form-check">
      <input type="radio" class="form-check-input" name="armaDeFogo" value="false">Não
    </div>

    <button type="submit" class="btn btn-primary">Cadastrar</button>
  </form>
</div>
</body>
</html>