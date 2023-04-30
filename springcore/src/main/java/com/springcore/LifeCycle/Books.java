package com.springcore.LifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Books {
 private int price;
 private int quant;
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQuant() {
	return quant;
}
public void setQuant(int quant) {
	this.quant = quant;
}
public Books() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Books [price=" + price + ", quant=" + quant + "]";
}

@PostConstruct
public void start()
{
	System.out.println("Books init method");
}

@PreDestroy
public void end()
{
	System.out.println("Books destory method");
}
 
 
}
