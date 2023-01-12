package com.Laptop.ls.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Laptop.Entity.LaptopEntity;
import com.Laptop.Service.LaptopService;

public class LaptopController {
	@RestController("/products")
	//@RequestMapping(path="website/products")
	public class Productcontroller 
	{
		@Autowired
		LaptopService productservice;

		@GetMapping(produces="application/json")
		public ResponseEntity<List<LaptopEntity>> getAllProducts()
		{
			return new ResponseEntity<List<LaptopEntity>>(.getAllProducts(),HttpStatus.OK); 
		}


		@GetMapping(value="/{ProductId}",produces="application/json")
		public ResponseEntity<LaptopEntity> getProductById(@PathVariable long ProductId)
		{
			return new ResponseEntity<LaptopEntity>(productservice.getProductById(ProductId),HttpStatus.OK); 
		}
		
		
    
    /*@ExceptionHandler(RuntimeException.class)
    public HttpStatus returnStatusCode()
    {
  	  return HttpStatus.NOT_FOUND;
    }*/

}
