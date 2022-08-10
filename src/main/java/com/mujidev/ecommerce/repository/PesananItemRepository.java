package com.mujidev.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mujidev.ecommerce.entity.PesananItem;

public interface PesananItemRepository extends JpaRepository<PesananItem, String> {
    
}
