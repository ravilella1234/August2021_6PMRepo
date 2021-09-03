package com.hdfc.loans.collections;

public class Emp2 
{
	private int eno;
	private String ename;
	
	public Emp2(int eno, String ename) 
	{
		super();
		this.eno = eno;
		this.ename = ename;
	}
	
	public int getEno() {
		return eno;
	}

	public String getEname() {
		return ename;
	}

	public void display()
	{
		System.out.println("EMPID : " +eno +"   "+ "ENAME : " + ename);
	}
	

	public static void main(String[] args) 
	{
		
		Emp2 e = new Emp2(1744, "ravilella");
		e.display();
	}

}
