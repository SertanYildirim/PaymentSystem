package com.sertanyildirim.paymentsystem.dto;

import com.sertanyildirim.paymentsystem.enums.PaymentStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PaymentRequestDto {

    @NotBlank(message = "Card number cannot be empty")
    @Pattern(regexp = "^[0-9]{13,19}$", message = "Card number must be between 13 and 19 digits")
    private String cardNumber;

    @NotBlank(message = "CVV cannot be empty")
    @Pattern(regexp = "^[0-9]{3}$", message = "CVV must be 3 digits")
    private String cvv;

    @NotBlank(message = "Cardholder name cannot be empty")
    @Pattern(regexp = "^[A-Za-zÇçĞğİıÖöŞşÜü ]+$", message = "Cardholder name must contain only letters and spaces")
    private String cardHolder;

    @NotBlank(message = "Expiry month is required")
    @Pattern(regexp = "^(0[1-9]|1[0-2])$", message = "Expiry month must be between 01 and 12")
    private String expiryMonth;

    @NotBlank(message = "Expiry year is required")
    @Pattern(regexp = "^[0-9]{2}$", message = "Expiry year must be two digits")
    private String expiryYear;

    @NotNull(message = "Amount is required")
    private BigDecimal amount;

    @NotBlank(message = "User ID cannot be blank")
    private String userId;

    @NotBlank(message = "Order ID cannot be blank")
    private String orderId;

    private String cardId; // Optional

    private String paymentMethod; // Optional (CARD, TRANSFER, etc.)

    private PaymentStatus status; // 🔹 güncelleme sırasında kullanılabilir
}
