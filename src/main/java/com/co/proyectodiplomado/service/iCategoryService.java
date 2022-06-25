package com.co.proyectodiplomado.service;

import java.util.List;

import com.co.proyectodiplomado.dao.Category;

public interface iCategoryService {

	// Read Operation
	List<Category> findAllCategories();
}
