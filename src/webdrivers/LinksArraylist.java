package webdrivers;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksArraylist 
{
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void beforeTest()
	{
		driver.get("https://kseb.in/");
		
	}
	 @Test
	   public void testLogin()
	   {
		 
		 List<WebElement> li=driver.findElements(By.tagName("link"));
		  System.out.println("links no: "+li.size());
		  for(WebElement s:li)
		  {
			  String links=s.getAttribute("href");
			  System.out.println(links);
		  }
		  
		/* List<WebElement> li=driver.findElements(By.tagName("img"));
		  System.out.println("links no: "+li.size());
		  for(WebElement s:li)
		  {
			  String links=s.getAttribute("src");
			  System.out.println(links);
		  }*/
	   }
	   @After
	   public void AfterLogin()
	   {
		   
	   }
}
