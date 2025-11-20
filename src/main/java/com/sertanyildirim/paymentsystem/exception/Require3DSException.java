package com.sertanyildirim.paymentsystem.fraud.exception;

import lombok.Getter;

@Getter
public class Require3DSException extends RuntimeException {

    private final int score;

    public Require3DSException(String message, int score) {
        super(message);
        this.score = score;
    }
}
