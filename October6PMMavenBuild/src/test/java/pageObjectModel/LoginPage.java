package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="email") public WebElement custEmail;
	@FindBy(id="pass") public WebElement custPassword;
	@FindBy(name="login") public WebElement loginIn;
	
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}


	public void customerLogin()
	{
		custEmail.sendKeys("qatest98394@gmail.com");
		custPassword.sendKeys("password");
		loginIn.click();
	}

}
