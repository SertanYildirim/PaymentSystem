package com.sertanyildirim.paymentsystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Sipariş tarihi
    private LocalDateTime orderDate = LocalDateTime.now();

    // Sipariş edilen ürün bilgisi
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    // Ödeme bilgisi
    @OneToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;

    private int quantity;
    private double totalAmount;

    private String cardType;
    private boolean success;
}
