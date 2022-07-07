package com.co.proyectodiplomado.service;

import java.util.List;

import com.co.proyectodiplomado.dao.Category;

public interface iCategoryService {
	// Save Operation
	Category saveCategory(Category category);

	// Read Operation
	List<Category> findAllCategories();
	
	//Update Operation
	Category updateCategory(Category category, Long categoryId);
	
	//Delete Operation
	void deleteCateegoryById(Long categoryId);
}
