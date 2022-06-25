package com.co.proyectodiplomado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.proyectodiplomado.dao.Category;
import com.co.proyectodiplomado.service.impl.CategoryServiceImpl;


@RestController
public class CategoryController {

	@Autowired
	private CategoryServiceImpl categoryServiceImpl;

	@GetMapping("/category")
	public List<Category> fetchDepartmentList() {
		return categoryServiceImpl.findAllCategories();
	}
}
