package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.AddToCartModel;
import com.example.demo.entity.AddToCartResponce;
import com.example.demo.entity.CouponModel;
import com.example.demo.entity.ProductEntity;
import com.example.demo.repo.ProductRepo;
import com.example.demo.service.CartService;

@Component
public class CartServiceImpl implements CartService {

	@Autowired
	ProductRepo productrepo;
	
	@Autowired
	RestTemplate resttemplate;

	@Override
	public AddToCartResponce addProducttocart(AddToCartModel AddToCartModel) {
		int couponId = AddToCartModel.getCouponId();
		int productId = AddToCartModel.getProductId();
		
		ProductEntity productEntity = productrepo.findById(productId).get();
		int productPrice = productEntity.getProductPrice();
		
		ResponseEntity<CouponModel> couponResponce = resttemplate.exchange("http://localhost:8084/getcouponsbyid?id="+couponId, HttpMethod.GET, null, CouponModel.class);
		CouponModel couponresponcebody = couponResponce.getBody();
		
		int totalprice = (productPrice * AddToCartModel.getQuantity())- couponresponcebody.getCouponPrice();
		
		AddToCartResponce addtocartresponce = new AddToCartResponce(productId,AddToCartModel.getQuantity(),couponresponcebody.getCouponName(),totalprice);
		
		return addtocartresponce;
	}
	
	
}
