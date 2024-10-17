package webdrivers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedfLogin 
{

	   ChromeDriver driver=new ChromeDriver();
	   
	   @Before
	   public void BeforLogin()
	   {
		   driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	   }
	   @Test
	   public void testLogin()
	   {
		   driver.findElement(By.name("login")).sendKeys("abcd");
		   driver.findElement(By.id("password")).sendKeys("pass123");
		   driver.findElement(By.name("proceed")).click();
	   }
	   @After
	   public void AfterLogin()
	   {
		   
	   }
	
}
