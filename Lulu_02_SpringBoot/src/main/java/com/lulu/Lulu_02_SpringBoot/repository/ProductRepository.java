package com.lulu.Lulu_02_SpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lulu.Lulu_02_SpringBoot.entity.SportsProduct;

public interface ProductRepository extends JpaRepository<SportsProduct, Integer> {

}
