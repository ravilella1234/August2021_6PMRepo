package icici.loans.homeloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String s1 = "ravikanth";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.hashCode());
		
		
		String s2 = new String("lella");
		System.out.println(s2);
		
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf('v'));
		
		System.out.println(s1.equals(s2));
		
		String s3 = "ravikanth";
		System.out.println(s1.equals(s3));
		
		String s4 = "Ravikanth";
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		
		String s5 = "Ravikan";
		System.out.println(s1.equals(s5));
		System.out.println(s1.equalsIgnoreCase(s5));
		System.out.println(s1.contains(s5));
		System.out.println(s1.contains(s5.toLowerCase()));
		
		//System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1.substring(2, 7));
		
		System.out.println(s1.replace('r', 'k'));
		
		String s6 = " Ravikanth";
		System.out.println(s1);
		System.out.println(s6);
		System.out.println(s1.equals(s6));
		System.out.println(s1.equals(s6.trim()));
		System.out.println(s1.equalsIgnoreCase(s6.trim()));
		System.out.println(s1.equals(s6.trim().toLowerCase()));
		
		String s7 = "ravi kanth lella";
		System.out.println(s7);
		String[] str = s7.split(" ");
		for(String s:str)
		{
			System.out.println(s);
		}
	}
}
