package com.springcore.StereotypeAnnotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//but if obj is not specified, then by default object with class name is created.
@Component("obj")
public class A {


	@Value("10")
	private int x;
	@Value("20")
	private int y;
	@Value("#{vals}")
	private List<Integer> values;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public List<Integer> getValues() {
		return values;
	}

	public void setValues(List<Integer> values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return "A [x=" + x + ", y=" + y + ", values=" + values + "]";
	}
		
	
}
