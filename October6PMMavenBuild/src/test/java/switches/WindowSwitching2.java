package switches;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowSwitching2 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		option.addArguments("--disable-notifications");
		
		WebDriver  driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.icicibank.com/");
		System.out.println(driver.getTitle());
		String parentwind = driver.getWindowHandle();
		System.out.println(parentwind);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("modal-close")))).click();
		
		
		driver.switchTo().frame("iframe-full-height");
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='content lifestyle-5']/div[@class='buttons']/a[contains(text(),'Apply now')]")))).click();;
		
		Set<String> winds = driver.getWindowHandles();
		for(String w :winds)
		{
			if(!parentwind.equals(w))
			{
				driver.switchTo().window(w);
			}
		}
		
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentwind);
		System.out.println(driver.getTitle());
		

	}

}
