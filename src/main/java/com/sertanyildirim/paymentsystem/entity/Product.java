package com.sertanyildirim.paymentsystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double price;

    private int stock;

    private double discountRate;

    // Dinamik indirim hesaplama (miktara göre)
    public double calculateDiscountedPrice(int quantity) {
        double discount = 0;
        if (quantity >= 20) discount = 0.15;
        else if (quantity >= 10) discount = 0.10;
        return price * quantity * (1 - discount);
    }
}
