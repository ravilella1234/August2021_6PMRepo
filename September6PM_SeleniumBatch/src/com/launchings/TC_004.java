package com.launchings;

import org.apache.log4j.Logger;

public class TC_004 extends BaseTest
{
	
	private static final Logger log = Logger.getLogger(TC_004.class);

	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("Execution Log Info --- " + d);
		log.info("Init the Properties files.... " );
		
		launch("chromebrowser");
		log.info("Opened the Browser :- " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigated to url :- " + childProp.getProperty("amazonurl"));
		
		selectOption("amazondropdown_id","Books");
		log.info("Selecting the option Books By using the locator :-" + orProp.getProperty("amazondropdown_id"));
		
		type("amazonsearchtextbox_name","Harry Potter");
		log.info("Entered the text  Harry Potter By using the locator :- " + orProp.getProperty("amazonsearchtextbox_name"));
		
		clickElement("amazonsearchbotton_xpath");		
		log.info("Clicked on Element By using locator :- " + orProp.getProperty("amazonsearchbotton_xpath"));	
		
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		//loc.sendKeys("Books");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		//driver.findElement(By.id("nav-search-submit-button")).click();

	}

}
