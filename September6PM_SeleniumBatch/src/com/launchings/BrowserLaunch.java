package com.launchings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch
{

	public static void main(String[] args) 
	{
		WebDriver driver= null;
		
		//WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravi\\Desktop\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.amazon.in");
		
		WebDriverManager.firefoxdriver().setup();
		//System.setProperty("webdriver.gecko.driver", "C:/Users/ravi/Desktop/drivers/geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.get("https://www.bestbuy.com");
		
		//webdriver.ie.driver
		//webdriver.edge.driver
	}

}
