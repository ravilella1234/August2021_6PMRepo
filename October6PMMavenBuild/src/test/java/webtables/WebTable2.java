package webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable2 
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		//String value = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[21]/td[4]")).getText();
		
		String value = driver.findElement(By.xpath("//a[contains(text(),'Ozone World')]/parent::*/following-sibling::td[3]")).getText();
		System.out.println(value);
	}

}
