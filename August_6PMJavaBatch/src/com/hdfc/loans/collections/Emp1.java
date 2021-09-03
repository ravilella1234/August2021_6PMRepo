package com.hdfc.loans.collections;

public class Emp1 extends Emp
{
	public static void main(String[] args) 
	{
		Emp e = new Emp();
		e.setEno(200);
		e.setEname("sai");
		
		System.out.println(e.getEno());
		System.out.println(e.getEname());
		
		//System.out.println(e.eno);
		//System.out.println(e.ename);
	}

}
