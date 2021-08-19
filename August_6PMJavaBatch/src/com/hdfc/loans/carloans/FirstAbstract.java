package com.hdfc.loans.carloans;

public abstract class FirstAbstract 
{
	int x = 100;
	
	public void m1()
	{
		System.out.println("iam m1 concrete in FirstAbstract");
	}
	
	public abstract void m2();
	
	public static void main(String[] args) 
	{
		//FirstAbstract obj1 = new FirstAbstract();
		
		FirstAbstract obj = new ChildClass();
		obj.m1();
		obj.m2();
		
	}
	

}
