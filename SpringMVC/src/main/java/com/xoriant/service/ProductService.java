package com.xoriant.service;

import java.util.List;
import com.xoriant.model.Product;

public interface ProductService {

	// get all products
	List<Product> getAllProducts();

	// adding single product
	boolean addProduct(Product product);

}