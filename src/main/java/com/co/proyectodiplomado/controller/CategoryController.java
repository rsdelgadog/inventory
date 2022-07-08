package com.co.proyectodiplomado.controller;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.co.proyectodiplomado.dao.Category;
import com.co.proyectodiplomado.service.impl.CategoryServiceImpl;

@RestController
public class CategoryController {

	@Autowired
	private CategoryServiceImpl categoryServiceImpl;

	// Save
	@PostMapping("/category")
	public Category saveCategory(@Valid @RequestBody Category category) {
		return categoryServiceImpl.saveCategory(category);
	}

	//Update
	@PutMapping("/category/{id}")
	public Category updateCategory(@RequestBody Category category,
								   @PathVariable("id") Long categoryId)
	{
		return categoryServiceImpl.updateCategory(category, categoryId);
	}
	
	//Delete
	@DeleteMapping("/category/{id}")
	public String deleteCategoryById(@PathVariable("id") Long categoryId) {
		
			categoryServiceImpl.deleteCateegoryById(categoryId);
			return "Delete Succesfully";
		
	}
	//Read
	@GetMapping("/category")
	public List<Category> fetchDepartmentList() {
		return categoryServiceImpl.findAllCategories();
	}
}
