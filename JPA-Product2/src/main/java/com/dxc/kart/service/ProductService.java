package com.dxc.kart.service;

import com.dxc.kart.entity.Product;
import com.dxc.kart.repo.ProductRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;
	
	public List<Product> listAll()
	{
		return repo.findAll();
	}
	
	public Product get(int id)
	{
		return repo.findById(id).get();
	}
	
	public void save(Product product)
	{
		repo.save(product);
	}
	
	public void delete(Integer id)
	{
		 repo.deleteById(id);
	}
}
