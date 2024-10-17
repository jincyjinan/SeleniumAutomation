package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.fblogin;

public class fbtest 
{
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void log_chk() 
	{
		fblogin fb=new fblogin(driver);
		fb.check("abc", "123");
		fb.clicks();
		
	}

}
