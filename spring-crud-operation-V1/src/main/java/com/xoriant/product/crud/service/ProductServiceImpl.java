package com.xoriant.product.crud.service;

import java.util.List;

import com.xoriant.product.crud.dao.ProductDao;
import com.xoriant.product.crud.models.Product;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;

	public ProductServiceImpl(ProductDao productDao) {
		this.productDao = productDao;
	}

	public boolean add(Product product) {
		return this.productDao.add(product);
	}

	public Product getProduct(String id) {
		return this.productDao.getProduct(id);
	}

	public List<Product> getAllProducts() {
		return this.productDao.getAllProducts();
	}

	public boolean delete(String id) {
		return this.productDao.delete(id);
	}
}
