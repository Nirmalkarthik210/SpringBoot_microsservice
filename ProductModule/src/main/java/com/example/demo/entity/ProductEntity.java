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
@NoArgsConstructor
@AllArgsConstructor
@Table(name="PRODUCTS")
public class ProductEntity {
	
	@Id
	@Column(name="PRODUCTID")
	private int productId;
	
	@Column(name="PRODUCTNAME")
	private String productName;
	
	@Column(name="PRODUCTPRICE")
	private int productPrice;

}
