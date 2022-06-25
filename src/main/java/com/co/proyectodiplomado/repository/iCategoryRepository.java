package com.co.proyectodiplomado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.co.proyectodiplomado.dao.Category;

@Repository
public interface iCategoryRepository extends JpaRepository<Category, Long> {

}
