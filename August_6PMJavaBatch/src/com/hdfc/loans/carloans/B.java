package com.hdfc.loans.carloans;

import com.hdfc.loans.eduloans.C;

public class B extends A // IS-A Relationship
{
	public void m1()
	{
		System.out.println("iam m1 overriden in B");
	}
	
	public void m2()
	{
		System.out.println("iam m2 in B");
	}

	public static void main(String[] args) 
	{
		A a = new A(); // HAS-A Relationship
		a.m1();
		
		//B b = new B();
		//b.m1();
		//b.m2();
		
		// We can use parent class reference variable to refer/hold child class object
		A obj ;
		
		obj = new B();
		obj.m1();
		
		obj = new C();
		obj.m1();
		
		//B obj1 = new A();
		
		
		
	}

}
