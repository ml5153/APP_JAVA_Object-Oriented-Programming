package com.sparta.running.day04.step4.exception;


public class NotEnoughFanPowerException extends RuntimeException {
    public NotEnoughFanPowerException() {
    }

    public NotEnoughFanPowerException(String message) {
        super(message);
    }
}
