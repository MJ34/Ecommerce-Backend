package com.mujidev.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mujidev.ecommerce.entity.Kategori;

public interface KategoriRepository extends JpaRepository<Kategori, String>{
    
}
