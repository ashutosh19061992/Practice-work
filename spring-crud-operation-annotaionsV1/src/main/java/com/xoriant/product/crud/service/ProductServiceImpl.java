package com.xoriant.product.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.product.crud.dao.ProductDao;
import com.xoriant.product.crud.models.Product;

@Service(value = "service")
public class ProductServiceImpl implements ProductService {

	// property based autowiring
//	@Autowired
	private ProductDao productDao;
	@Autowired
	public ProductServiceImpl(ProductDao productDao) {
		this.productDao = productDao;
	}

//	public void setProductDao(ProductDao productDao) {
//		this.productDao = productDao;
//	}

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
