package com.hdfc.loans.carloans;

public interface Rbi 
{
	int x =100;
	
	public void withdrawl();// abstract Method
	public void deposit();
	
	public static void main(String[] args) 
	{
		//Rbi i = new Rbi();
		
		Rbi i ;
		
		i = new HDFC();
		i.deposit();
		i.withdrawl();
		
		i = new ICICI();
		i.deposit();
		i.withdrawl();
	}
	
}
