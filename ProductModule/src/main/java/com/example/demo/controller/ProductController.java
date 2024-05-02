package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.AddToCartModel;
import com.example.demo.entity.AddToCartResponce;
import com.example.demo.entity.ProductEntity;
import com.example.demo.service.CartService;
import com.example.demo.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class ProductController {

	@Autowired
	ProductService productservice;
	
	@Autowired
	CartService cartservice;
	
	@PostMapping("/createproducts")
	public ProductEntity createProductsService(@RequestBody ProductEntity productentity) {		
		return productservice.createproduct(productentity);
	}
	
	@GetMapping("/getproducts")
	public List<ProductEntity> getProductsService() {
		return productservice.getproducts();
	}
	
	@GetMapping("/getproductbyid/{productId}")
	public ProductEntity getProductServiceById(@PathVariable int productId) {
		return productservice.getProductsById(productId);
	}
	
	@PostMapping("/addtocart")
	public AddToCartResponce addToCartService(@RequestBody AddToCartModel AddToCartModel) {
		return cartservice.addProducttocart(AddToCartModel);
	}
	
	
}
