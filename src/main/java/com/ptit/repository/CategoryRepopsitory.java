package com.ptit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ptit.entity.CategoryEntity;

public interface CategoryRepopsitory extends JpaRepository<CategoryEntity, Long> {

	CategoryEntity findOneByCode(String code);
}
