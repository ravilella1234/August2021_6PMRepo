package switches;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Permissionpopups 
{

	public static void main(String[] args) 
	{
		
		ChromeOptions option = new ChromeOptions();
		HashMap<String,Integer> contentSetting = new HashMap<String, Integer>();
		HashMap<String, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		
		
		//https://chromium.googlesource.com/chromium/src/+/7e762c1f17514a29834506860961ba2f24e7e6e5/components/content_settings/core/common/pref_names.cc
		
		contentSetting.put("geolocation", 2);
		//contentSetting.put("media_stream", 0);
		//contentSetting.put("notifications", 1);
		
		profile.put("managed_default_content_settings", contentSetting);
		prefs.put("profile", profile);
		option.setExperimentalOption("prefs", prefs);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://whatmylocation.com/");

	}

}
