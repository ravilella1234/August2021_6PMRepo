package com.hdfc.loans.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapUserDefineObject 
{
	public static void main(String[] args) 
	{
		//Emp2 e = new Emp2(1745, "sai");
		//e.display();
		//System.out.println(e.getEno());
		//System.out.println(e.getEname());
		
		Emp2 e1 = new Emp2(1, "sai1");
		Emp2 e2 = new Emp2(2, "sai2");
		Emp2 e3 = new Emp2(3, "sai3");
		Emp2 e4 = new Emp2(4, "sai4");
		
		//e1.display();
		//e2.display();
		//e3.display();
		//e4.display();
		
		HashMap<Integer, Emp2> h = new HashMap<Integer, Emp2>();
		h.put(e1.getEno(), e1);
		h.put(e2.getEno(), e2);
		h.put(e3.getEno(), e3);
		h.put(e4.getEno(), e4);
		
		Set<Entry<Integer, Emp2>> entries = h.entrySet();
		for(Entry<Integer, Emp2> e:entries)
		{
			System.out.println(e.getKey());
			Emp2 ee = e.getValue();
			ee.display();
		}
		
		//Alternative way to print using Iterator
		 Iterator<Integer> iterator = h.keySet().iterator();
		while(iterator.hasNext())
		{
			Emp2 e = h.get(iterator.next());
			e.display();
		}
		
	}
}
