package com.sertanyildirim.paymentsystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "payments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String cardNumber;

    @Column(nullable = false)
    private String cardHolder;

    @Column(nullable = false)
    private String expiryDate; // MM/YY formatında

    @Column(nullable = false)
    private String cvv;

    private String cardType; // Visa, MasterCard, vb.

    private double amount;   // Ödenen tutar

    private boolean success; // Ödeme başarılı mı

    @Column(nullable = false)
    private int quantity = 10; // varsayılan olarak 1 adet

    // Yeni ilişki alanı
    @ManyToOne
    @JoinColumn(name = "product_id") // tabloya product_id sütunu ekler
    private Product product;

}
