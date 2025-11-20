package com.sertanyildirim.paymentsystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cards")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cardHolder;
    private String cardNumberMasked; // Örn: **** **** **** 4444
    private String expiryDate;
    private String cardType; // Visa / MasterCard

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
