package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.CouponEntity;

@Service
public interface CouponService {
	CouponEntity createcoupon(CouponEntity couponEntity);
	List<CouponEntity> getcouponslst();
	CouponEntity getCouponById(int id);
}
