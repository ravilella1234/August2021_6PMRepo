package com.hdfc.loans.eduloans;

import com.hdfc.loans.carloans.A;
import com.hdfc.loans.carloans.B;

public class C extends A
{
	public void m1()
	{
		System.out.println("iam m1 overriden in C");
	}
	
	public void m3()
	{
		System.out.println("iam m3 in C");
	}

	public static void main(String[] args) 
	{		
		A a  = new A();
		a.m1();
		
		B b = new B();
		b.m1();
		b.m2();
			
		C c = new C();
		c.m1();
		c.m3();
	}

}
