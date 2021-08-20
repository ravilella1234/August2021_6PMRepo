package com.hdfc.loans.eduloans;

public class Student 
{
	int sno;
	String sname;
	
	//getClass().getName() + '@' + Integer.toHexString(hashCode(
	
	public Student(int sno, String sname) 
	{
		super();
		this.sno = sno;
		this.sname = sname;
	}
	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + "]";
	}


	public static void main(String[] args) 
	{
		Student s = new Student(100, "sai");
		System.out.println(s);
	}
}
