package webdrivers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DrpdoenPgm 
{
	 ChromeDriver driver=new ChromeDriver();
	   
	   @Before
	   public void BeforLogin()
	   {
		   driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	   }
	   @Test
	   public void testLogin()
	   {
		  WebElement w= driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		  Select sc=new Select(w);
		  sc.selectByValue("20");
		 
		   WebElement w1=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		   Select mon=new Select(w1);
		   mon.selectByVisibleText("JAN");
		   
		   WebElement yr=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
		   Select yrele=new Select(yr);
		   yrele.selectByValue("1990");
		   
	   }
	   @After
	   public void AfterLogin()
	   {
		   
	   }

}
