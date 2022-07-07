package com.co.proyectodiplomado.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {
	
	@Id
	private Long id;
	
	@Column(name = "Cat_Name")
	private String CatName;
	
	@Column (name = "periodo_fiscal")
	private String PerFiscal;
	
	@Column (name = "cantidad")
	private String Cantidad;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCatName() {
		return CatName;
	}

	public void setCatName(String catName) {
		CatName = catName;
	}

	public String getPerFiscal() {
		return PerFiscal;
	}

	public void setPerFiscal(String perFiscal) {
		PerFiscal = perFiscal;
	}

	public String getCantidad() {
		return Cantidad;
	}

	public void setCantidad(String cantidad) {
		Cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", CatName=" + CatName + ", PerFiscal=" + PerFiscal + ", Cantidad=" + Cantidad
				+ "]";
	}





}
