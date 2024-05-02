package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddToCartResponce {

	private int productId;
	private int quantity;
	private String couponName;
	private int totalPrice;
}
