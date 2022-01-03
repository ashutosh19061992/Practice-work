package com.xoriant.eshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.xoriant.eshop.model.Product;
import com.xoriant.eshop.model.Review;
import com.xoriant.eshop.utility.ProductReviewUtility;
import com.xoriant.eshop.utility.ProductUtility;

@Service
public class ProductServiceImpl implements ProductService {

	// add new product
	@Override
	public Product addProduct(Product product) {
		return ProductUtility.addProduct(product);
	}

	// List all products
	@Override
	public List<Product> getAllProducts() {
		return ProductUtility.getAllProducts();
	}

	// add product review
	@Override
	public Review addProductReview(Review review) {
		return ProductReviewUtility.addProductReview(review);
	}

	// get all product review
	@Override
	public List<Review> getAllProductsReview() {
		return ProductReviewUtility.getAllProductsReview();
	}

	// get single product review
	@Override
	public List<Review> getProductReview(String productId) {
		return ProductReviewUtility.getProductReview(productId);
	}
}
