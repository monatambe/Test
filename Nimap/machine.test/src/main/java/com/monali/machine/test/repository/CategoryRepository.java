package com.monali.machine.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monali.machine.test.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
