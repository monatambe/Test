package com.monali.machine.test.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.monali.machine.test.entity.*;

public interface ProductRepository extends JpaRepository<Product, Long> {

	void save(Category category);
}
