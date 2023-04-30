package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	
	//in bean, values are accepted as string, so first
	//string constrcutor will be called.
	//if string constrcutor is not there, then 
	//whosoever either int or double is present at the top, will be called.
	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("int constrcutor");
	}
	
	public Addition(double a,double b)
	{
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("double constructor");
	}
	
	public Addition(String a,String b)
	{
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("string constructor");
		
	}
	
	public void add() {
		System.out.println("Sum: "+(a+b));
	}
}
