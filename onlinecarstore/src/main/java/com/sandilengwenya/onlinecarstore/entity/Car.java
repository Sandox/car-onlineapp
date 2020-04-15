package com.sandilengwenya.onlinecarstore.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tbl_car")
@Setter
@Getter
@ToString
public class Car {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; // auto generated Primary key 
	
	private String sku; 
	
	private String name;
	
	private String description; 
	
	// maps this variable to the the column name in DB that does not have the same name
	@Column(name="unit_price") 
	private BigDecimal unitPrice;
	
	@Column(name="url")
	private String imageUrl; 
	
	private boolean active; 
    
	@Column(name="units_in_stock")
	private int unitsInStock;
    
	@Column(name="date_created")
	private Date createdOn;
    
	@Column(name="last_updated")
	private Date updatedOn;
    
	@ManyToOne
	@JoinColumn(name="category_id", nullable=false)
	private CarCategory category;
	
	// #####MAKING USE OF LOMBOK to create Getters and Setter########### 
}
