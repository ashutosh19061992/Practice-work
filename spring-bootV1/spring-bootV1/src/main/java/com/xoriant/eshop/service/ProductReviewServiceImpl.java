package com.xoriant.eshop.service;

import org.springframework.stereotype.Service;

@Service
public class ProductReviewServiceImpl implements ProductReviewService {

	@Override
	public void saveProductReview() {
		System.out.println(">>>> In save product review <<<< ");
	}
}
