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
<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
    <div class="container-fluid">
        <div class="collapse navbar-collapse" id="mynavbar">
            <ul class="navbar-nav me-auto">
                <li class="nav-item">
                    <a class="nav-link" href="/">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/ameacaavida/lista">AmeacaAVida</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/crime/lista">Crime</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/crise/lista">Crise</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/emergencia/lista">Emergencia</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/patrimonio/lista">Patrimonio</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/requisitante/lista">Requisitante</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/vitima/lista">Vitima</a>
                </li>
            </ul>
            <form class="d-flex">
                <input class="form-control me-2" type="text" placeholder="Search">
                <button class="btn btn-primary" type="button">Search</button>
            </form>
        </div>
    </div>
</nav>
<div class="container mt-3">
  <h2>Cadastramento de usuário</h2>
  <form action="/usuario/incluir" method="POST">
    <div class="mb-3 mt-3">
        <label>Nome:</label>
        <input type="nome" class="form-control" placeholder="Entre com seu nome" name="nome">
      </div>
    <div class="mb-3 mt-3">
      <label for="email">Email:</label>
      <input type="email" class="form-control" placeholder="Entre com seu email" name="email">
    </div>
    <div class="mb-3">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" placeholder="Entre com sua senha" name="senha">
    </div>

    <button type="submit" class="btn btn-primary">Cadastrar</button>
  </form>
</div>
</body>
</html>