package icici.loans.carloans;

public class ChildClass extends FirstAbstract
{

	public void m1()
	{
		System.out.println("iam m1 overidden in ChildClass");
	}
	
	@Override
	public void m2() 
	{
		System.out.println("iam m2 implimented in ChildClass");
	}
	
	public static void main(String[] args) 
	{
		ChildClass obj = new ChildClass();
		obj.m1();
		obj.m2();
	}

}
