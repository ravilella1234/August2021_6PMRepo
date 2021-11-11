package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable1 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> tr_collection = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("Number of rows : " +  tr_collection.size());
		
		for(WebElement trElement:tr_collection)
		{
			List<WebElement> td_collection = trElement.findElements(By.tagName("td"));
			for(WebElement tdElement:td_collection)
			{
				if(tdElement.getText().equals("Austria"))
				{
					System.out.println(tdElement.getText());
				}
				
			}
		}
		
	}

}
