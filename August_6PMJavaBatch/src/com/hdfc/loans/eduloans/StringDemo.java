package com.hdfc.loans.eduloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String s1 = "ravikanth";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.hashCode());
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf('v'));
		System.out.println(s1.substring(2, 7));
		System.out.println(s1);
		
		String s2 = new String("Ravikanth");
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		String s3 = "ravikan";
		System.out.println(s1.contains(s3));
		
		String s4 = "lella";
		//s1 = s1+s4;
		s1 = s1.concat(s4);
		System.out.println(s1);
		
		System.out.println(s2.startsWith("Ravi"));
		System.out.println(s2.endsWith("nth"));

		System.out.println(s2);
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		System.out.println(s2);
		System.out.println(s2.startsWith("ravi"));
		System.out.println(s2.toLowerCase().startsWith("ravi"));
		
		System.out.println(s2);
		
		String s5 = " Ravikanth";
		
		System.out.println(s2.equals(s5.trim()));
		
		System.out.println(s5);
		System.out.println(s5.trim());
		
		String s6 = "Ravikanth";
		String s7 = " ravikanth";
		System.out.println(s6.equals(s7));
		System.out.println(s6.toLowerCase().equals(s7.trim()));
		System.out.println(s6.equalsIgnoreCase(s7.trim()));
		
		System.out.println(s6);
		
		System.out.println(s6.replace('R', 'K'));
		
		String s8 = "ravi kanth Lella";
		System.out.println(s8);
		
		String[] str = s8.split(" ");
		for(String s:str)
		{
			System.out.println(s);
		}
	}

}
