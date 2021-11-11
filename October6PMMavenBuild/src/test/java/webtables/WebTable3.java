package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable3 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		
		driver.findElement(By.id("departureCalendar")).click();
		
		while(!driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText().contains("January 2022"))
		{
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}

		List<WebElement> dateList = driver.findElements(By.xpath("//div[@class='DayPicker-Body']/div/div[@class='DayPicker-Day']"));
		int count = dateList.size();
		
		for(int i=0;i<count;i++)
		{
			String dateTest = dateList.get(i).getText();
			System.out.println(dateTest);
			if(dateTest.equalsIgnoreCase("20"))
			{
				dateList.get(i).click();
				break;
			}
		}
		
		
	}

}
