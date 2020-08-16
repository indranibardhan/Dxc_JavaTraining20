package com.dxc.kart.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.kart.entity.Product;
import com.dxc.kart.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService service;
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> list()
	{
		return new ResponseEntity<List<Product>>(service.listAll(),HttpStatus.OK);
	}
	
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable int id)
	{
		try 
		{
			Product product=service.get(id);
			return new ResponseEntity<Product>(product,HttpStatus.OK);
		}
		
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> add(@RequestBody Product product)
	{
		service.save(product);
		return new ResponseEntity<String>("Product added successfully",HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> update(@RequestBody Product updateProduct)
	{
		try
		{
			Product product=service.get(updateProduct.getId());
			service.save(updateProduct);
			return new ResponseEntity<String>("Product updated successfully",HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<String>("No id found",HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable int id)
	{
		try
		{
			service.get(id);
			service.delete(id);
			return new ResponseEntity<String>("Product deleted",HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<String>("Product not found",HttpStatus.NOT_FOUND);
		}
	}
}
