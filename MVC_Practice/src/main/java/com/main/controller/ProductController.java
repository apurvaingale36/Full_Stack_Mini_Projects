package com.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.Product;
import com.main.serviceimpl.ProductServiceImplementation;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductServiceImplementation impl;
	
	@GetMapping("/getallproduct")
	public ResponseEntity<List<Product>> getProduct(){
		return impl.getAllProducts();
	}
	
	@GetMapping("/getproductbyid/{id}")
	public ResponseEntity<Optional<Product>> getbyid(int id){
		return impl.findProductById(id);
	}
	
	@PostMapping("/product/addproduct")
	public ResponseEntity<Product> addproduct(Product product){
		return impl.addProduct(product);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Product> updateproduct(int id,Product newproduct){
		return impl.updateProduct(id, newproduct);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteproduct(int id){
		return impl.deleteProduct(id);
	}
}

