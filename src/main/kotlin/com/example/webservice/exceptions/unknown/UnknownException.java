package com.example.webservice.exceptions.unknown;

public class UnknownException extends Throwable{
    public UnknownException() {
        super();
    }

    public UnknownException(String message) {
        super(message);
    }
}
