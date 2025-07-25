package com.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.main.entity.Product;
import com.main.repository.ProductRepository;
import com.main.service.ProductService;

@Service
public class ProductServiceImplementation implements ProductService{
	
	@Autowired
	ProductRepository repo;

	public  ResponseEntity<List<Product>> getAllProducts(){
		
		try {
			List<Product> list=repo.findAll();
			return new ResponseEntity<>(list,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);		
		}
	}

	public ResponseEntity<Product> addProduct(Product product) {
		
		try {
			Product pro=repo.save(product);
			return new ResponseEntity<>(pro,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
		}
	}

	public ResponseEntity<Product> updateProduct(int id,Product newproduct) {
		try {
			Product existingpro=repo.findById(id).orElse(null);
			if(existingpro!=null) {
				existingpro.setName(newproduct.getName());
				existingpro.setPrice(newproduct.getPrice());
				Product updatedpro=repo.save(existingpro);
				return new ResponseEntity<>(updatedpro,HttpStatus.OK);
			}
			else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);			}
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
		}
	}

	public ResponseEntity<Void> deleteProduct(int id) {
		try {
			repo.deleteById(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);		
		}
	}

	public ResponseEntity<Optional<Product>> findProductById(int id) {
		
		try {
			Optional<Product> pro=repo.findById(id);
			return new ResponseEntity<>(pro,HttpStatus.NOT_FOUND);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
}
