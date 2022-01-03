package com.xoriant.eshop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ProductReviewDaoImpl implements ProductReviewDao {

	@Override
	public void saveProductReview() {
		// saving product review
		System.out.println(">>> In product review save <<<");
	}
}
