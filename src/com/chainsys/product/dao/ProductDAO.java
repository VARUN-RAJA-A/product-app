package com.chainsys.product.dao;

import java.util.Set;

import com.chainsys.product.model.Product;

public interface ProductDAO {
	Set<Product> findAll();

	Product findById(int id);

	void save(Product product);

	void update(Product product);

	void delete(int id);
	
	void findByName(String productName);
	 
	void updateExpiryDate
	 
	
}
