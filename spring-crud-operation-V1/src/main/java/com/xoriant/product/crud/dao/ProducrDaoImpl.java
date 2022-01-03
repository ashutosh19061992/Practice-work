package com.xoriant.product.crud.dao;

import java.util.List;

import com.xoriant.product.crud.models.Product;

public class ProducrDaoImpl implements ProductDao {

	public boolean add(Product product) {
		System.out.println("Product Added..");
		return true;
	}

	public Product getProduct(String id) {
		System.out.println("Prouct is.");
		return null;
	}

	public List<Product> getAllProducts() {
		System.out.println("List of products");
		return null;
	}

	public boolean delete(String id) {
		System.out.println("Product deleted.");
		return true;
	}
}
