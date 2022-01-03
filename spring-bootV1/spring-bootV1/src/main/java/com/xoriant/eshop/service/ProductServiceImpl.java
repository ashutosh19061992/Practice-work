package com.xoriant.eshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.eshop.dao.ProductDao;
import com.xoriant.eshop.dao.ProductReviewDao;

@Service
public class ProductServiceImpl implements ProductService, ProductReviewService {

	@Autowired
	private ProductDao productdDao;

	private ProductReviewDao productReviewDao;

	@Override
	public void saveProduct() {
		this.productdDao.saveProduct();
	}

	@Override
	public void saveProductReview() {
		this.productReviewDao.saveProductReview();
	}
}
