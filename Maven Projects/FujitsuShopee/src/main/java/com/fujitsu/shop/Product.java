package com.fujitsu.shop;
public class product
{
 int productId;
 String name;
 String brand;
 float price;
 
 public Product(){
 
 }
 
 public Product(int productId,String name,String brand,float price){
  this.productId=productId;
  this.name=name;
  this.brand=brand;
  this.price=price;
  }
  public void display(){
     system.out.println("productId is :" + productId);
     system.out.println("name is :" + name);
	system.out.println("brand is :" + brand);
	 system.out.println("price is :" +price);
  }
  
 }