package com.xoriant.eshop.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.xoriant.eshop.enums.Gender;
import com.xoriant.eshop.model.Product;
import com.xoriant.eshop.model.Review;
import com.xoriant.eshop.model.User;

public class ProductReviewUtility {

	private static List<Review> productReview = new ArrayList<Review>();

	static {
		Product shirt = ProductUtility.getProductById("P006");

		Review userOneReview = new Review("REV0", "Resonable cost, must buy", "8.5",
				new User("USER-01", "Ashutosh", Gender.MALE));

		userOneReview.setProduct(shirt);
		productReview.add(userOneReview);
	}

	public static List<Review> getAllProductsReview() {
		return productReview;
	}

	public static Review addProductReview(Review review) {
		productReview.add(review);
		return review;
	}

	public static List<Review> getProductReview(String productID) {
		List<Review> singleProductReview = getAllProductsReview().stream()
				.filter(review -> review.getProduct().getId().equals(productID)).collect(Collectors.toList());
		return singleProductReview;
	}

}
