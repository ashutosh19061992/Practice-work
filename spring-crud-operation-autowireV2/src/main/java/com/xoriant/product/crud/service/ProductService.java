package com.xoriant.product.crud.service;

import java.util.List;

import com.xoriant.product.crud.models.Product;

public interface ProductService {

	boolean add(Product product);

	Product getProduct(String id);

	List<Product> getAllProducts();

	boolean delete(String id);

}