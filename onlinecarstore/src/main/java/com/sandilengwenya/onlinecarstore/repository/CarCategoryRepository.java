package com.sandilengwenya.onlinecarstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sandilengwenya.onlinecarstore.entity.CarCategory;


@RepositoryRestResource(collectionResourceRel="CarCategory", path="car-category")
public interface CarCategoryRepository extends JpaRepository<CarCategory, Long> {

}

// No need to create Controller because of the  Spring Data Rest API which will create Rest end points based on entity name
