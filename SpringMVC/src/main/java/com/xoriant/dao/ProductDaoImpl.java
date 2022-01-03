package com.xoriant.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.xoriant.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// get all products
	public List<Product> getAllProducts() {
		return this.jdbcTemplate.query("select * from products", new ResultSetExtractor<List<Product>>() {
			List<Product> productList = new ArrayList<Product>();

			public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {
				while (rs.next()) {
					Product product = new Product();
					product.setId(rs.getString("id"));
					product.setName(rs.getString("name"));
					product.setDescription(rs.getString("description"));
					product.setPrice(rs.getDouble("price"));
					productList.add(product);
				}
				return productList;
			}

		});
	}

	// adding single product
	public boolean addProduct(Product product) {
		int addedRow = this.jdbcTemplate.update("insert into product where name=?, description=?, price=?",
				product.getName(), product.getDescription(), product.getPrice());
		if (addedRow > 0) {
			return true;
		}
		return false;
	}
}
