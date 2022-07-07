package com.co.proyectodiplomado.service.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.proyectodiplomado.dao.Category;
import com.co.proyectodiplomado.repository.iCategoryRepository;
import com.co.proyectodiplomado.service.iCategoryService;

@Service
public class CategoryServiceImpl implements iCategoryService {
	@Autowired
	private iCategoryRepository categoryRepository;

	// Read
	@Override
	public List<Category> findAllCategories() {
		return (List<Category>) categoryRepository.findAll();
	}

	// Save
	@Override
	public Category saveCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public Category updateCategory(Category category, Long categoryId) {
		Category catDB = categoryRepository.findById(categoryId).get();
		if (Objects.nonNull(category.getCatName()) && !"".equalsIgnoreCase(category.getCatName())) {
			catDB.setCatName(category.getCatName());
		}
		if (Objects.nonNull(category.getPerFiscal()) && !"".equalsIgnoreCase(category.getPerFiscal())) {
			catDB.setPerFiscal(category.getPerFiscal());
		}
		if (Objects.nonNull(category.getCantidad() ) && !"".equalsIgnoreCase(category.getCantidad())) {
			catDB.setCantidad(category.getCantidad());
		}
		
		return categoryRepository.save(catDB);
	}

	@Override
	public void deleteCateegoryById(Long categoryId) {

		categoryRepository.deleteById(categoryId);
	}

}
