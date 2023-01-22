package com.attornatus.backend.exception;

public class CadastroInvalidoException extends Exception {
    public CadastroInvalidoException(String exceptionMessage){
        super(exceptionMessage);
    }
}
