package com.co.proyectodiplomado.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {
	
	@Id
	private int id;
	
	@Column(name = "Cat_Name")
	private String CatName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCatName() {
		return CatName;
	}

	public void setCatName(String catName) {
		CatName = catName;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", CatName=" + CatName + "]";
	}
	
	
}
