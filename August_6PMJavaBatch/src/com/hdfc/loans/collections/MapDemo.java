package com.hdfc.loans.collections;

import java.util.Hashtable;

public class MapDemo 
{

	public static void main(String[] args)
	{
		Hashtable<String, Integer> h = new Hashtable<String, Integer>();
		h.put("ravi", 10);
		h.put("kavi", 20);
		h.put("pavi", 30);
		h.put("lavi", 40);
		h.put("avi", 50);
		h.put("bavi", 60);
		
		
		System.out.println(h);
		//System.out.println(h.get(10));
		System.out.println(h.size());
		System.out.println(h.hashCode());
		System.out.println(h.isEmpty());
		
		
		/*
		 * Set<Integer> keys = h.keySet(); for(Integer k:keys) { System.out.println(k
		 * +"----" + h.get(k)); }
		 */
	}

}
