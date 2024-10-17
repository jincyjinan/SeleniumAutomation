package automationTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sampleGoogle 
{
	ChromeDriver driver;
	@BeforeTest
	public void fun_Bfortest()
	{
		driver=new ChromeDriver();
	}
    @BeforeMethod (alwaysRun = true)
    public void fun_bformeth()
    {
    	driver.get("https://www.google.com/");
    }
    @Parameters("s")
    @Test (groups= {"sanity"})
    public void serch(String s)
    {
       System.out.println(s);
       driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(s,Keys.ENTER);
    }
}
