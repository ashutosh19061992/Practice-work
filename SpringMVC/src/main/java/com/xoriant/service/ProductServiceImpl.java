package com.xoriant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.dao.ProductDao;
import com.xoriant.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao dao;

	// get all products
	public List<Product> getAllProducts() {
		return this.dao.getAllProducts();
	}

	// adding single product
	public boolean addProduct(Product product) {
		return this.dao.addProduct(product);
	}
}
