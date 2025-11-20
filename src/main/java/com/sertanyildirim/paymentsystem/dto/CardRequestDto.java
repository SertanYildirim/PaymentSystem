package com.sertanyildirim.paymentsystem.dto;

import lombok.Data;
import java.util.UUID;

@Data
public class CardRequestDto {
    private String cardHolder;
    private String cardNumberMasked; // "************4444"
    private Integer expiryMonth;
    private Integer expiryYear;
    private String cardType; // VISA, MASTERCARD, etc.
    private boolean isDefault;
    private UUID userId;
}
