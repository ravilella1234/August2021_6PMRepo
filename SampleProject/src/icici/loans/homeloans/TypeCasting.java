package icici.loans.homeloans;

public class TypeCasting 
{

	public static void main(String[] args) 
	{
		// byte-1, short-2, int-4, long-8, float-4, double-8
		
		//1-Liter --->  500ML  --->  There is no risk  ---> widening
		//1-Liter --->  1.5ltr --->  There is a risk (water overflow) ---> Narrowing
		
		// Type casting from 1-Primitive type to another Primitive type
		double x = 10.7;
		System.out.println(x);
		
		int y = (int) x;
		System.out.println(y);

		int x1 = 100;
		System.out.println(x1);
		
		double x2 = (int)x1;
		System.out.println(x2);
		
		int p=97;
		System.out.println(p);
		
		char q = (char) p;
		System.out.println(q);
		
		// Type casting from 1-Primitive type to corresponding wapperClass type
		
		int y1 = 10;
		System.out.println(y1);
		
		//Integer y2 = y1;
		Integer y2  = Integer.valueOf(y1);
		System.out.println(y2);
		
		float f1 = 12.34f;
		System.out.println(f1);
		
		//Float f2 = f1;
		Float f2 = Float.valueOf(f1);
		System.out.println(f2);
		
		// Type casting from 1-Class type to another Class type
		
		String s1 = "200";
		String s2 = "300";
		System.out.println(s1+s2);
		
		Integer i1 = Integer.valueOf(s1);
		Integer i2 = Integer.valueOf(s2);
		System.out.println(i1+i2);
		
		Float ff1 = Float.valueOf(s1);
		Float ff2 = Float.valueOf(s2);
		System.out.println(ff1+ff2);
		
	}

}
