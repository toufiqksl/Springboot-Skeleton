package com.example.webservice.exceptions.invalid;

public class InvalidException extends Throwable{
    public InvalidException() {
    }

    public InvalidException(String message) {
        super(message);
    }
}
