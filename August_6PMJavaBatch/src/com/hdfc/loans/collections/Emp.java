package com.hdfc.loans.collections;

public class Emp 
{
	private int eno;
	private String ename;
	
	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public static void main(String[] args) 
	{
		Emp e = new Emp();
		e.setEno(100);
		e.setEname("ravilella");
		
		System.out.println(e.getEno());
		System.out.println(e.getEname());
		//System.out.println(e.eno);
		//System.out.println(e.ename);
	}

}
