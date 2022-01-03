package com.xoriant.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.eshop.model.Product;
import com.xoriant.eshop.model.Review;
import com.xoriant.eshop.service.ProductService;

@RestController
@RequestMapping(value = "/api/product")
public class ProductRestController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/newProduct", method = RequestMethod.POST)
	public ResponseEntity<?> addProduct(@RequestBody Product product) {
		Product addedProduct = this.productService.addProduct(product);
		if (addedProduct != null) {
			return ResponseEntity.status(HttpStatus.CREATED).body(addedProduct);
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Something went wrong while adding new product.");
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<?> getAllProducts() {
		List<Product> allProducts = this.productService.getAllProducts();
		if (!allProducts.isEmpty()) {
			return ResponseEntity.status(HttpStatus.OK).body(allProducts);
		}
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body("[]");
	}

	@RequestMapping(value = "/reviews")
	public ResponseEntity<?> getAllProductReview() {
		List<Review> allProductsReview = this.productService.getAllProductsReview();
		if (!allProductsReview.isEmpty()) {
			return ResponseEntity.status(HttpStatus.OK).body(allProductsReview);
		}
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body("[]");
	}

	/**
	 * @param userReview
	 * @return
	 */
	@RequestMapping(value = "/addReview", method = RequestMethod.POST)
	public ResponseEntity<?> addNewReview(@RequestBody Review userReview) {
		if (userReview != null) {
			Review addedProductReview = this.productService.addProductReview(userReview);
			return ResponseEntity.status(HttpStatus.CREATED).body(addedProductReview);
		}
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body("[]");
	}

	/**
	 * @param productId
	 * @return
	 */
	@RequestMapping(value = "/review/{productId}")
	public ResponseEntity<?> getReviewByPoductId(@PathVariable String productId) {
		List<Review> productReview = this.productService.getProductReview(productId);
		if (!productReview.isEmpty()) {
			return ResponseEntity.status(HttpStatus.CREATED).body(productReview);
		}
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body("[]");
	}

}
