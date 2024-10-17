package automationTestng;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class datePikerPgm 
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
    @BeforeMethod
    public void url_load()
    {
    	driver.get("https://www.booking.com/index.html");
    	driver.manage().window().maximize();
    }
    @Test
    public void fun_datePick() throws  InterruptedException, AWTException
    {
    	  try
          {             		
    	   Robot r=new Robot();
       	   driver.navigate().refresh();
    	   r.mouseWheel(5);
    	   Thread.sleep(3000);
       	   WebElement wb=driver.findElement(By.xpath("//*[@id='indexsearch']/div[2]/div/form/div[1]/div[2]/div/div/button[1]/span"));
       	   wb.click();
    	   System.out.println("success "+wb.isDisplayed());
           while(true)
           {
    	     Thread.sleep(2000);
         	 WebElement mon= driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3")); 
    	     String month=mon.getText();
    	     System.out.println("mon: "+month);
    	    if(month.equalsIgnoreCase("january 2024"))
    	     {
    		    System.out.println("Pass");
    		    break;
    	     }
    	     else
    	     {
    	    	 Thread.sleep(2000);
    	        driver.findElement(By.xpath("//*[@id='calendar-searchboxdatepicker']/div/div[1]/button")).click();  
    	      
      	     } 
    	    
           }
           List<WebElement> allDate=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr/td/span"));
           for(WebElement dates : allDate)
           {
        	   String day=dates.getText();
        	   System.out.println(day);
        	   if(day.equals("10"))
        	   {
        		   dates.click();
        		   break;
        	   }
           }
    	}
    	catch(StaleElementReferenceException e)
    	{
    		System.out.println("error");
    	}
    }
}
