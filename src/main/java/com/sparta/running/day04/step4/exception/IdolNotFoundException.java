package com.sparta.running.day04.step4.exception;

public class IdolNotFoundException extends RuntimeException {
    public IdolNotFoundException() {
    }
    public IdolNotFoundException(String message) {
        super(message);
    }
}
