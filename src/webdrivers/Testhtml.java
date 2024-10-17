package webdrivers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testhtml 
{
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void beforeTest()
	{
		driver.get("file:///C:/Users/hp/Desktop/dispalert.html");	
	}
	@Test
	public void testLogin()
    {
		  driver.findElement(By.xpath("//input[@onclick='display_alert()']")).click();
		  Alert a= driver.switchTo().alert();
		  String txt=a.getText();
		  a.accept();	
		  System.out.println("Alert msg: "+txt);
		  String btnText=driver.findElement(By.xpath("//input[@onclick='display_alert()']")).getAttribute("value");
		  System.out.println("Button Txt: "+btnText);
		  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ammu");
		  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sara");
		  driver.findElement(By.xpath("//input[@value='Submit']")).click();
		 
	 }
	 @After
	 public void AfterLogin()
	 {
		   
	 }

}
