package com.roxiler.task.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.roxiler.task.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findProductsByPrice(double parseDouble);
    
	@Query("SELECT p FROM Product p WHERE p.title LIKE %:search% OR p.description LIKE %:search%")
	List<Product> findProductsByTitleOrDescription(@Param("search")String search);
}
