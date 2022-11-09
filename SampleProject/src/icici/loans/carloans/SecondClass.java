package icici.loans.carloans;

public class SecondClass 
{

	// data properties
	int a=10, b=20, c;
	
	// behaviuors
	public void add()
	{
		c = a+b;
		System.out.println("Add of A & B is : "+ c);
	}
	
	public void sub()
	{
		c = a-b;
		System.out.println("Sub of A & B is : "+ c);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hello");
				
		SecondClass obj = new SecondClass();
		obj.add();
		obj.sub();
	}
}
