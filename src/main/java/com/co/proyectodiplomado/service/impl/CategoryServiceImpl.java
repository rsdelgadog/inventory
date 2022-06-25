package com.co.proyectodiplomado.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.proyectodiplomado.dao.Category;
import com.co.proyectodiplomado.repository.iCategoryRepository;
import com.co.proyectodiplomado.service.iCategoryService;

@Service
public class CategoryServiceImpl implements iCategoryService {
	@Autowired
	private iCategoryRepository categoryRepository;

	@Override
	public List<Category> findAllCategories() {
		// TODO Auto-generated method stub
		return (List<Category>) categoryRepository.findAll();
	}

}
