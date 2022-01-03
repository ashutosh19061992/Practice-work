package com.xoriant.eshop.service;

import java.util.List;

import com.xoriant.eshop.model.Product;
import com.xoriant.eshop.model.Review;

public interface ProductService {

	// add new product
	Product addProduct(Product product);

	// List all products
	List<Product> getAllProducts();

	// add product review
	Review addProductReview(Review review);

	// get all product review
	List<Review> getAllProductsReview();

	// get single product review
	List<Review> getProductReview(String productId);

}