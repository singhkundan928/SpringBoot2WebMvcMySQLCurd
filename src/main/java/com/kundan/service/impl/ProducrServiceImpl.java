package com.kundan.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kundan.model.Product;
import com.kundan.repository.ProductRepository;
import com.kundan.service.ProductService;




@Service
public class ProducrServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product addProduct(Product product) {
		product.setProdDiscount((product.getProdCost()*8)/100);
		product.setProdGst((product.getProdCost()*12)/100);
		return productRepository.save(product);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Product> getAllProduct() {
		List<Product> productList = productRepository.findAll();
		Collections.sort(productList,(obj1,obj2) -> obj2.getProdId() - obj1.getProdId());
		return productList;
	}
	
	@Override
	public void deleteProduct(Integer prodId) {
		productRepository.deleteById(prodId);
	}
	
	@Override
	public Product getOneProduct(Integer prodId) {
		Optional<Product> product = productRepository.findById(prodId);
		if(product.isPresent()) {
			return product.get();
		}
		return null;
	}
	
	@Override
	public void updateProduct(Product product) {
		product.setProdDiscount((product.getProdCost() * 8)/100);
		product.setProdGst((product.getProdCost() * 12)/100);
		productRepository.save(product);
	}
}
