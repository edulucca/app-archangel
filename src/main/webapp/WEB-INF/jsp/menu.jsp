<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
    <div class="container-fluid">
        <div class="collapse navbar-collapse" id="mynavbar">
            <ul class="navbar-nav me-auto">
                <li class="nav-item">
                    <a class="nav-link" href="/">Home</a>
                </li>
                <c:if test="${not empty user}">
                    <li class="nav-item">
                        <a class="nav-link" href="/usuario/lista">Usuário</a>
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
                </c:if>
            </ul>
            <ul class="navbar-nav me-auto">
                <c:if test="${empty user}">
                    <li class="nav-item">
                        <a class="nav-link" href="/usuario">Signup</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/login">Login</a>
                    </li>
                </c:if>
                <c:if test="${not empty user}">
                    <li class="nav-item">
                        <a class="nav-link" href="/logout">Logout - ${user}</a>
                    </li>
                </c:if>
            </ul>
            <form class="d-flex">
                <input class="form-control me-2" type="text" placeholder="Search">
                <button class="btn btn-primary" type="button">Search</button>
            </form>
        </div>
    </div>
</nav>

