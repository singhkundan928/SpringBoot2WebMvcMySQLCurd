package com.kundan.service;

import java.util.List;

import com.kundan.model.Product;

public interface ProductService {
	
	public Product addProduct(Product product);
	
	public List<Product> getAllProduct();
	
	public void deleteProduct(Integer prodId);
	
	public Product getOneProduct(Integer prodId);
	
	public void updateProduct(Product product);

}
