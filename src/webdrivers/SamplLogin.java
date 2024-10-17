package webdrivers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamplLogin 
{
	 ChromeDriver driver=new ChromeDriver();
	   
	   @Before
	   public void BeforLogin()
	   {
		   driver.get("https://www.instagram.com/accounts/login/");
	   }
	   @Test
	   public void testLogin()
	   {
		  //driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abcd");
		  //driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcd123");
		  //driver.findElement(By.xpath("//button[@type='submit']")).click();
		   driver.findElement(By.xpath("//*[@id='loginForm']/div/div[1]/div/label/input")).sendKeys("abcd");
		   driver.findElement(By.xpath("//*[@id='loginForm']/div/div[2]/div/label/input")).sendKeys("abcd123");
		   driver.findElement(By.xpath("//*[@id='loginForm']/div/div[3]/button")).click();

		   
	   }
	   @After
	   public void AfterLogin()
	   {
		   
	   }
}
