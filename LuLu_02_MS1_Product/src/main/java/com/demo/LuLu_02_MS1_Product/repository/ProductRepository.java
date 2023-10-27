package com.demo.LuLu_02_MS1_Product.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.LuLu_02_MS1_Product.entity.SportsProducts;



public interface ProductRepository extends JpaRepository<SportsProducts, Integer> {

	//
	@Query("SELECT s FROM SportsProducts s ")
	List<SportsProducts> findAllMyQuery();



	@Query(value ="SELECT * FROM sports_products",nativeQuery = true)  ///Native Query
	List<SportsProducts> findAllNativeQuey();



}