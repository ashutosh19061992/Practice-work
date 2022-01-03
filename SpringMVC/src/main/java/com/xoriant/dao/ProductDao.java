package com.xoriant.dao;

import java.util.List;

import com.xoriant.model.Product;

public interface ProductDao {

	// get all products
	List<Product> getAllProducts();

	// addproduct
	boolean addProduct(Product product);
}