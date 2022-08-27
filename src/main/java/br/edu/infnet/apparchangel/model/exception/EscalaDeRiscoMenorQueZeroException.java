package br.edu.infnet.apparchangel.model.exception;

public class EscalaDeRiscoMenorQueZeroException extends Exception{
    private static final long serialVersionUID = 1L;

    public EscalaDeRiscoMenorQueZeroException(String mensagem){
        super(mensagem);
    }
}
