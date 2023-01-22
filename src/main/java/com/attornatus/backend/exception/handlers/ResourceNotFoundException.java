package com.attornatus.backend.exception.handlers;

public class ResourceNotFoundException extends Exception {
    public ResourceNotFoundException (String exceptionMessage){
        super(exceptionMessage);
    }
}
