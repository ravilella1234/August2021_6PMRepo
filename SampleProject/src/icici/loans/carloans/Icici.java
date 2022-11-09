package icici.loans.carloans;

public class Icici implements Rbi 
{

	@Override
	public void withdrawl() {
		System.out.println("iam overriden withdrawl in ICICI");
	}

	@Override
	public void deposit() {
		System.out.println("iam overriden depossit in ICICI");
	}
	
	public static void main(String[] args) 
	{
		Icici i = new Icici();
		i.deposit();
		i.withdrawl();
	}

}
