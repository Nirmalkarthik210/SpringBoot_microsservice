package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="COUPONS")
public class CouponEntity {
	@Id
	@Column(name="COUPONID")
	private int couponId;
	
	@Column(name="COUPONNAME")
	private String couponName;
	
	@Column(name="COUPONPRICE")
	private int couponPrice;
	
}
