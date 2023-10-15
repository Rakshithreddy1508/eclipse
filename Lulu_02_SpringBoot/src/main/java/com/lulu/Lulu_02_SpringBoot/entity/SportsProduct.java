package com.lulu.Lulu_02_SpringBoot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table
public class SportsProduct {
	
@Id
int Id;
String name;
float cost;
String descp;
public SportsProduct() {
	super();
	// TODO Auto-generated constructor stub
}
public SportsProduct(int id, String name, float cost, String descp) {
	super();
	Id = id;
	this.name = name;
	this.cost = cost;
	this.descp = descp;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getCost() {
	return cost;
}
public void setCost(float cost) {
	this.cost = cost;
}
public String getdescription() {
	return descp;
}
public void setDesc(String descp) {
	this.descp = descp;
}
@Override
public String toString() {
	return "SportsProduct [Id=" + Id + ", name=" + name + ", cost=" + cost + ", descp=" + descp + "]";
  } 
}