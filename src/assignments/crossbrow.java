package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrow 
{
	WebDriver driver;
	@Parameters ("browser") 
	@BeforeMethod
	public void setup(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new EdgeDriver();
		}
		
	}
	@Test
	public void load()
	{
		driver.get("https://www.caritashospital.org/");
	}

}
