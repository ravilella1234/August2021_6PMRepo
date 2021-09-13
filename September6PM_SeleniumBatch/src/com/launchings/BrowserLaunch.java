package com.launchings;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravi\\Desktop\\drivers\\chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/ravi/Desktop/drivers/geckodriver.exe");
		FirefoxDriver driver1 = new FirefoxDriver();
		
		//webdriver.ie.driver
		//webdriver.edge.driver
	}

}
