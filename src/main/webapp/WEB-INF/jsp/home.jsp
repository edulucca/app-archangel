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

    <h3>Classe: Emergencia</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>localizacao</td>
            <td>String</td>
            <td>Dados da localização da emergência</td>
        </tr>
        <tr>
            <td>status</td>
            <td>String</td>
            <td>Apresenta em qual fase a emergência se apresenta no momento atual</td>
        </tr>
        <tr>
            <td>dataHora</td>
            <td>LocalDateTime</td>
            <td>Registro da data e da hora de quando a emergência é acionada</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Requisitante</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>nome</td>
            <td>String</td>
            <td>Nome do requisitante (responsável por registrar a emergência)</td>
        </tr>
        <tr>
            <td>cpf</td>
            <td>String</td>
            <td>CPF do requisitante</td>
        </tr>
        <tr>
            <td>telefone</td>
            <td>String</td>
            <td>Número de celular do requisitante</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Vitima</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>nome</td>
            <td>String</td>
            <td>Nome da vítima envolvida na crise.</td>
        </tr>
        <tr>
            <td>nomeDaMae</td>
            <td>String</td>
            <td>Nome da Mãe da vítima para fins de identificação</td>
        </tr>
        <tr>
            <td>idade</td>
            <td>String</td>
            <td>Idade da vítima</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Crise</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>escalaDeRisco</td>
            <td>int</td>
            <td>Define de 0 a 5 o risco da crise</td>
        </tr>
        <tr>
            <td>nome</td>
            <td>String</td>
            <td>Apelido da crise</td>
        </tr>
        <tr>
            <td>descricao</td>
            <td>String</td>
            <td>Apresenta informações gerais sobre a crise (como iniciou, seus motivos, possíveis agentes responáveis)</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: AmeacaAVida</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>nrVitima</td>
            <td>int</td>
            <td>Contabiliza o numero de vítimas em crises que geram lesão ou risco de vida</td>
        </tr>
        <tr>
            <td>tipoFerimento</td>
            <td>String</td>
            <td>Descreve informações gerais sofre o ferimento</td>
        </tr>
        <tr>
            <td>statusVitima</td>
            <td>List String</td>
            <td>Checklist com dados selecionáveis indicando o possível estado de saúde da vítima</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Patrimonio</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>nrPatrimonio</td>
            <td>int</td>
            <td>Contabiliza o numero de patrimônios atingidos ou em riscos de perda total</td>
        </tr>
        <tr>
            <td>tipo</td>
            <td>String</td>
            <td>Dica qual o tipo de patrimônio em risco (ex.: Moradia, Veículo, Comércio, Ambiental)</td>
        </tr>
        <tr>
            <td>agenteDeRisco</td>
            <td>String</td>
            <td>Define qual o agente danoso ao patrimônio (ex.: fogo, força física, água, pragas)</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Crime</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>nrVitimas</td>
            <td>int</td>
            <td>Contabiliza o numero de vítimas de um ato criminoso</td>
        </tr>
        <tr>
            <td>nrSuspeitos</td>
            <td>String</td>
            <td>Contabiliza o numero de possíveis suspeitos de um ato criminoso</td>
        </tr>
        <tr>
            <td>armaBranca</td>
            <td>boolean</td>
            <td>Indica se o ato criminoso envolve o uso de armas brancas</td>
        </tr>
        <tr>
            <td>armaDeFogo</td>
            <td>boolean</td>
            <td>Indica se o ato criminoso envolve o uso de armas de fogo</td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>