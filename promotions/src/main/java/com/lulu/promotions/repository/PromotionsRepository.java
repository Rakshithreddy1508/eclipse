package com.lulu.promotions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lulu.promotions.entity.PromotionsEntity;

@Repository
public interface PromotionsRepository extends JpaRepository<PromotionsEntity, Integer>{

}