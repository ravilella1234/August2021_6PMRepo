package com.launchings;

public class TC_004 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");
		
		navigateUrl("amazonurl");
		
		selectOption("searchDropdownBox","Books");
		
		type("twotabsearchtextbox","Harry Potter");
		
		clickElement("nav-search-submit-button");
		
		
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		//loc.sendKeys("Books");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		//driver.findElement(By.id("nav-search-submit-button")).click();

	}

}
