package switches;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowSwitching {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB); // It opens a new blank tab
		//driver.switchTo().newWindow(WindowType.WINDOW); // It opens a new blank window
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());

	}

}
