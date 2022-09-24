<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

        <div class="mb-3 mt-3">
            <label>Nome da Crise:</label>
            <input type="text" class="form-control" placeholder="Dê um apelido de fácil identificação para o incidente."
                   name="nome">
        </div>

        <div class="mb-3 mt-3">
            <label>Escala de Risco:</label>
            <input type="number" class="form-control" placeholder="Entre com a escala de risco. (1 - mais baixo | 5 - mais alto)"
                   min="1" max="5" name="escalaDeRisco">
        </div>

        <div class="mb-3 mt-3">
            <label>Descrição:</label>
            <textarea class="form-control" placeholder="Escreva uma breve descrição do incidente" rows="3"
                      name="descricao"></textarea>
        </div>