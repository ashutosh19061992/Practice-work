package com.xoriant.product.crud.dao;

import java.util.List;

import com.xoriant.product.crud.models.Product;

public interface ProductDao {

	boolean add(Product product);

	Product getProduct(String id);

	List<Product> getAllProducts();

	boolean delete(String id);

}