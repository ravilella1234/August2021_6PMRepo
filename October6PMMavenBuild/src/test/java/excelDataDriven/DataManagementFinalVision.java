package excelDataDriven;

import org.testng.annotations.Test;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;

public class DataManagementFinalVision 
{
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String> obj)
  {
	  System.out.println("userEmail :" + obj.get("UserName"));
	  System.out.println("userPassword : " + obj.get("UserPassword"));
  }

  @DataProvider
  public Object[][] getData() throws Exception 
  {
	    ExcelAPI e =new ExcelAPI("C:\\Users\\ravi\\Desktop\\suitex.xlsx");
		String sheetName = "data";
		String testcaseName = "LoginTest";
		
		return DataUtils.getTestData(e, sheetName, testcaseName);
  }
}
