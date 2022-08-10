package com.mujidev.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mujidev.ecommerce.entity.Produk;

public interface ProdukRepository extends JpaRepository<Produk, String> {
    
}
