package com.hdfc.loans.carloans;

public class Second 
{
	
	//properties
	int a=10, b=20, result;
	
	//behaviours
	public void add()
	{
		result = a+b;
		System.out.println("Add of A & B  is : " + result);
	}
	
	public void sub()
	{
		result =a-b;
		System.out.println("Sub of A & B is : " + result);
	}
	
	public static void main(String[] args) 
	{
		//int x = 100;
		
		Second obj = new Second();
		obj.add();
		obj.sub();
		
		Second obj1 = new Second();
		obj1.add();
		obj1.sub();
	}

}
