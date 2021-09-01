package com.hdfc.loans.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a  = new ArrayList<String>();
		a.add("oracle");
		a.add("Dell");
		a.add("Intel");
		a.add("TCS");
		
		System.out.println(a);
		
		ListIterator<String> var = a.listIterator();
		while(var.hasNext())
		{
			String val = var.next();
			if(val.equals("oracle"))
				var.set("vmware");
			else
				var.remove();
		}
		System.out.println(a);
	}

}
