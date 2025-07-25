package com.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.main.entity.Product;

public interface ProductService {
	
	
	public ResponseEntity<List<Product>> getAllProducts();
	
	public ResponseEntity<Product> addProduct(Product product);
	
	public ResponseEntity<Product> updateProduct(int id,Product newproduct);
	
	public ResponseEntity<Void> deleteProduct(int id);
	
	public ResponseEntity<Optional<Product>> findProductById(int id);
	

	

}
