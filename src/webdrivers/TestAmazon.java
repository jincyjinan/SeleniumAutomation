package webdrivers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAmazon 
{
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void beforeTest()
	{
		driver.get("https://www.amazon.in");
		
	}
	 @Test
	   public void testLogin()
	   {
		  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		  driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		  driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		  driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc123");
		  driver.findElement(By.xpath("//input[@id='continue']")).click();
		  driver.navigate().back();
		  driver.navigate().back();	   
	   }
	   @After
	   public void AfterLogin()
	   {
		   
	   }
}
