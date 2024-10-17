package automationTestng;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class datePikPgm 
{
	WebDriver driver;
	String baseurl="https://www.booking.com/";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
    @BeforeMethod
    public void url_load()
    {
    	driver.get(baseurl);
    }
    @Test
    public void fun_datePick() throws InterruptedException, AWTException
    { 
    	Robot robot = new Robot();
    	driver.manage().window().maximize();
    	driver.navigate().refresh();
    	robot.mouseWheel(5);
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div[1]/button[1]")).click();
    	WebElement btn=driver.findElement(By.xpath("//*[@id='calendar-searchboxdatepicker']/div/div[1]/button"));
    	for(int i=0;i<3;i++)
    	{
    	Thread.sleep(3000);
    	btn.click();
    	}
    	List<WebElement> li =driver.findElements(By.xpath("//*[@id=\"calendarsearchboxdatepicker\"]/div/div/div/div/table/tbody/tr/td/span"));
    			for(WebElement s:li)
    			{
    			String link = s.getAttribute("data-date");
    			System.out.println(link);
    			if(link.contains("2024-02-12"))
    			{
    			s.click();
    			}
    			}	
}
}



