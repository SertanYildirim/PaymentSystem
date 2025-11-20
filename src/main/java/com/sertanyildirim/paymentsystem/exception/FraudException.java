package com.sertanyildirim.paymentsystem.fraud.exception;

import lombok.Getter;

@Getter
public class FraudException extends RuntimeException {

    private final int score;

    public FraudException(String message, int score) {
        super(message);
        this.score = score;
    }
}
