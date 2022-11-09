package icici.loans.carloans;

import java.io.File;
import java.util.Date;

public class FirstClass 
{

	public static void main(String[] args)
	{
		Date dt = new Date();
		String d = dt.toString().replace(':', '_');
		File f = new File("C:\\Users\\ravi\\Desktop\\"+d+"\\");
		f.mkdirs();
	}

}
