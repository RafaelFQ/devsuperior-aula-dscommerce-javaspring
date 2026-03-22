package com.auladevsuperior.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auladevsuperior.dscommerce.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
