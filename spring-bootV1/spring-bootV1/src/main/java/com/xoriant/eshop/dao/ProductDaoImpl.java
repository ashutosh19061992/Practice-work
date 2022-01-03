package com.xoriant.eshop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements ProductDao {

	// save product
	@Override
	public void saveProduct() {
		System.out.println(">>>> In product save <<<<");
	}
}
