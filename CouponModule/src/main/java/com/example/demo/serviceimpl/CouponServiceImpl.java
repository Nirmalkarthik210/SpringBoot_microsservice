package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.CouponEntity;
import com.example.demo.repo.CouponRepo;
import com.example.demo.service.CouponService;

@Component
public class CouponServiceImpl implements CouponService{

	@Autowired
	CouponRepo couponrepo;

	@Override
	public CouponEntity createcoupon(CouponEntity couponEntity) {
		return couponrepo.save(couponEntity);
	}

	@Override
	public List<CouponEntity> getcouponslst() {
		return couponrepo.findAll();
	}

	@Override
	public CouponEntity getCouponById(int id) {
		return couponrepo.findById(id).get();
	}
	
	
	
	
}
