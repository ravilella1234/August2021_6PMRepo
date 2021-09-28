package com.launchings;

public class TC_004 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");
		
		navigateUrl("amazonurl");
		
		selectOption("amazondropdown_id","Books");
		
		type("amazonsearchtextbox_name","Harry Potter");
		
		clickElement("amazonsearchbotton_xpath");		
			
		
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		//loc.sendKeys("Books");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		//driver.findElement(By.id("nav-search-submit-button")).click();

	}

}
