package com.sandilengwenya.onlinecarstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;


import com.sandilengwenya.onlinecarstore.entity.Car;

public interface CarRepository extends JpaRepository<Car,Long>{
	
	/*
	 * list of books by category
	 * */
	@RestResource(path = "categoryid")
	Page<Car> findByCategoryId(@Param("id") Long id, Pageable pageable);
	

}
