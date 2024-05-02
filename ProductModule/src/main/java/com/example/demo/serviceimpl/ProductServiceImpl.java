package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.ProductEntity;
import com.example.demo.repo.ProductRepo;
import com.example.demo.service.ProductService;

@Component
public class ProductServiceImpl implements ProductService {

	
	@Autowired
	ProductRepo productrepo;

	@Override
	public ProductEntity createproduct(ProductEntity productEntity) {
		return productrepo.save(productEntity);
	}

	@Override
	public List<ProductEntity> getproducts() {
		return productrepo.findAll();
	}

	@Override
	public ProductEntity getProductsById(int productId) {
		return productrepo.findById(productId).get();
	}
	
	
}
