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
    <h2>AppArchAngel</h2>
    <p>Software para gerar alertas e gerenciar emergências</p>

    <h3>Classe: Vítima</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Nome</th>
            <th>Nome da Mãe</th>
            <th>Idade</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Jorge Pereira</td>
            <td>Marcela Fernanda</td>
            <td>22</td>
        </tr>
        </tbody>
    </table>

    
</div>
</body>
</html>