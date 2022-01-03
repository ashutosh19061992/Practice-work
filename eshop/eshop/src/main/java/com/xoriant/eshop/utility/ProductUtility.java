package com.xoriant.eshop.utility;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.xoriant.eshop.model.Product;
import com.xoriant.eshop.model.Review;

public final class ProductUtility {

	private static List<Product> productList = new ArrayList<Product>();
	private static List<Review> productReview = new ArrayList<Review>();
	
	static {
		productList.add(new Product("P001", "Book", 333.0, LocalDate.now(), "Java Book"));
		productList.add(new Product("P002", "Pen", 50.0, LocalDate.now(), "Black Pen"));
		productList.add(new Product("P003", "Monitor", 20000.0, LocalDate.now(), "HP Monotor"));
		productList.add(new Product("P004", "Mouse", 600.0, LocalDate.now(), "Dell Mouse"));
		productList.add(new Product("P005", "Shoes", 1600.0, LocalDate.now(), "Addidas Mens Shoes"));
		productList.add(new Product("P006", "Shirt", 2500.0, LocalDate.now(), "Black Casual Shirt"));
	}

	public static List<Product> getAllProducts() {
		return productList;
	}

	// adding product
	public static Product addProduct(Product product) {
		if (product != null) {
			productList.add(product);
			return product;
		}
		return null;
	}

	// find product by id
	public static Product getProductById(String productId) {
		Product prod = getAllProducts().stream().filter(product -> product.getId().equals(productId)).findAny()
				.orElse(null);
		System.out.println(prod);
		return prod;
	}

	// adding reviews
	public static Review addProductReview(Review review) {
		productReview.add(review);
		return review;
	}

}
