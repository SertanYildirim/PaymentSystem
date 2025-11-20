package com.sertanyildirim.paymentsystem.repository;

import com.sertanyildirim.paymentsystem.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Özel sorgular eklenebilir (şimdilik gerek yok)
}
