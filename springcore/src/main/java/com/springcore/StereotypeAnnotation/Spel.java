package com.springcore.StereotypeAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Spel {
	
	//T(class).variable or constant or function e.t.c
	@Value("#{4+5}")
	private int x;
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double b;
	@Value("#{9>5?2:3}")
	private int result;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Spel [x=" + x + ", b=" + b + ", result=" + result + "]";
	}
	
	

	
}
