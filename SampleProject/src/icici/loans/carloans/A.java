package icici.loans.carloans;

import java.util.Date;

public  class A 
{
	public  final static int x = 100;
	
	public void m1()
	{
		
		System.out.println("iam m1 from A");
	}
	
	public static void m4()
	{
		System.out.println("iam m4 static method");
	}
	
	static
	{
		System.out.println("iam static block....");
	}
	
	static 
	{
		Date d = new Date();
		System.out.println(d);
	}

	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		A.m4();
	}

}
