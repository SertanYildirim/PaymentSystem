package com.sertanyildirim.paymentsystem.provider.exception;

import lombok.Getter;

@Getter
public class ProviderErrorException extends RuntimeException {

    private final String providerCode;

    public ProviderErrorException(String message, String providerCode) {
        super(message);
        this.providerCode = providerCode;
    }
}
