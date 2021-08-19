package com.hdfc.loans.eduloans;

public class VariableTypes 
{
	//primitive variable
	int x = 100; // instance (or) non-static (or) global-instance
	static String cName = "vmware"; // static  (or) global-static
	static VariableTypes obj ;
	
	public void m1()
	{
		int x =200; // local
		//System.out.println(y);
		
		System.out.println(x);
		System.out.println(this.x);
		
		System.out.println(VariableTypes.cName);
	}
	
	
	public static void m2()
	{
		 obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.cName);
	}

	public static void main(String[] args) 
	{
		 obj = new VariableTypes(); // non-primitive (or) reference variable
		System.out.println(obj.x);
		System.out.println(VariableTypes.cName);
	}

}
