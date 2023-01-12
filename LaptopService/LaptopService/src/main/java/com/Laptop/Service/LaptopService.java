package com.Laptop.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.Laptop.Entity.LaptopEntity;
import com.Laptop.Repo.LaptopRepo.Productrepository;




public class LaptopService {
	@Autowired
	Productrepository productRepo;
	//	@Autowired 
	//    RestTemplate restTemplate;

	public List<LaptopEntity> getAllProducts()
	{

		return productRepo.findAll();
	}
	public LaptopEntity getProductById(long ProductId)
	{
		Optional<LaptopEntity> p = productRepo.findByProductId(ProductId);
		if(p.isPresent())
		{	

			return p.get();
		}  	
		return new LaptopEntity();
	}
}
