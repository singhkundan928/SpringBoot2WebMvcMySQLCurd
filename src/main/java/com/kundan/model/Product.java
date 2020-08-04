package com.kundan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue
	@Column(name = "product_id")
	private Integer prodId;
	
	@Column(name = "product_code")
	private String prodCode;
	
	@Column(name = "product_type")
	private String prodType;
	
	@Column(name = "product_cost")
	private Double prodCost;
	
	@Column(name = "product_note")
	private String prodNote;
	
	@Column(name = "product_discount")
	private Double prodDiscount;
	
	@Column(name = "product_gst")
	private Double prodGst;
	
}
