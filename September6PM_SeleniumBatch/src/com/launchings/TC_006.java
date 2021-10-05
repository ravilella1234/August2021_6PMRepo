package com.launchings;

import com.aventstack.extentreports.Status;

public class TC_006 extends BaseTest
{
	
	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.createTest("TC_006");
		test.log(Status.INFO, "Init the Properties files.... ");
				
		launch("chromebrowser");
		test.log(Status.PASS, "Opened the Browser :- " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.INFO, "Navigated to url :- " + childProp.getProperty("amazonurl"));
		
		selectOption("amazondropdown_id","Books");
		test.log(Status.PASS, "Selecting the option Books By using the locator :-" + orProp.getProperty("amazondropdown_id"));
		
		type("amazonsearchtextbox_name","Harry Potter");
		test.log(Status.PASS, "Entered the text  Harry Potter By using the locator :- " + orProp.getProperty("amazonsearchtextbox_name"));
				
		clickElement("amazonsearchbotton_xpath");	
		test.log(Status.PASS, "Clicked on Element By using locator :- " + orProp.getProperty("amazonsearchbotton_xpath"));
	
		report.flush();
	}

}
