package com.launchings;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest
{
	public static WebDriver driver;
	public static String projectPath = System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties p;
	public static Properties mainProp;
	public static Properties childProp;
	
	public static void init() throws Exception
	{
		fis = new FileInputStream(projectPath+"\\data.properties");
		p = new Properties();
		p.load(fis);
		//System.out.println(p.getProperty("chromebrowser"));
		//System.out.println(p.getProperty("amazonurl"));
		
		fis = new FileInputStream(projectPath+"\\environment.properties");
		mainProp = new Properties();
		mainProp.load(fis);
		String e = mainProp.getProperty("env");
		System.out.println(e);
		
		fis = new FileInputStream(projectPath+"\\"+e+".properties");
		childProp = new Properties();
		childProp.load(fis);
		System.out.println(childProp.getProperty("amazonurl"));
	}
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			//Binaries
			//logs
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, projectPath+"\\firefoxlogs.log");
			//Notifications
			//certificate errors
			//work with proxy settings
			
			WebDriverManager.firefoxdriver().setup();
			
			ProfilesIni p = new ProfilesIni();
			FirefoxProfile profile = p.getProfile("septemberffprofile");
			
			FirefoxOptions option  = new FirefoxOptions();
			option.setProfile(profile);
			
			//Notifications
			profile.setPreference("dom.webnotifications.enabled", false);
			
			//Binaries
			//option.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			
			//certificate errors
			profile.setAcceptUntrustedCertificates(true);
			profile.setAssumeUntrustedCertificateIssuer(false);
			
			//work with proxy settings // about:config
			profile.setPreference("network.proxy.type", 1);
			profile.setPreference("network.proxy.socks", "192.168.10.1");// dummy IP i have given make a note
			profile.setPreference("network.proxy.socks_port", 1744);
			
			driver = new FirefoxDriver(option);
		}
	}
	
	public static void navigateUrl(String url)
	{
		//driver.get(childProp.getProperty(url));
		driver.navigate().to(childProp.getProperty(url));
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

}
