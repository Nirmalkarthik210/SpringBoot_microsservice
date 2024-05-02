package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CouponEntity;
import com.example.demo.service.CouponService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class CouponController {

	@Autowired
	CouponService couponservice;
	
	@PostMapping("createcoupons")
	public CouponEntity createCouponsService(@RequestBody CouponEntity couponentity) {
		return couponservice.createcoupon(couponentity);
	}
	
	@GetMapping("getcoupons")
	public List<CouponEntity> getCouponsService() {
		return couponservice.getcouponslst();
	}
	
	@GetMapping("getcouponsbyid")
	public CouponEntity getCouponsServiceById(@RequestParam int id) {
		return couponservice.getCouponById(id);
	}
	
	
}
