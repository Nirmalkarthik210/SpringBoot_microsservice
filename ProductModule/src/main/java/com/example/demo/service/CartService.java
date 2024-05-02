package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.AddToCartModel;
import com.example.demo.entity.AddToCartResponce;

@Service
public interface CartService {
	AddToCartResponce addProducttocart(AddToCartModel AddToCartModel);
}
