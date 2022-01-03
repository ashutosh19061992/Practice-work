package com.xoriant.product.crud.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.xoriant.product.crud.models.Product;

@Repository
public class ProductDiscountedImpl implements ProductDao{

	public boolean add(Product product) {
	System.out.println(">>> Discounted product save  <<<<<< ");
		return false;
	}

	public Product getProduct(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
