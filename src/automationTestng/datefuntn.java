package automationTestng;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class datefuntn 
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://flycreativeglobal.com/");
		driver.manage().window().maximize();
	}
	

	@Test
	public void datecheck() throws Exception
	{	
		WebElement enqbtn=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/section[5]/div/div[3]/div/div/div/div/a/span/span"));
		enqbtn.click();
		WebElement tabid=driver.findElement(By.xpath("//*[@id=\"elementor-popup-modal-5367\"]/div/div[2]/div/section/div/div/div/div[2]/div/ul"));
		
		 List<WebElement> tablinks=tabid.findElements(By.tagName("a"));
         int no=3;
         WebElement linkClk= tablinks.get(no);
         linkClk.click();
         WebElement datePicker = driver.findElement(By.id("form-field-field_ec10af7"));
         datePicker.clear();
         
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id='form-field-name']")).sendKeys("ammu");
 		driver.findElement(By.xpath("//*[@id='form-field-field_ef4465c']")).sendKeys("985652347");
 		driver.findElement(By.xpath("//*[@id='form-field-email']")).sendKeys("abc@as.com");
 		WebElement reqService=driver.findElement(By.xpath("//*[@id='form-field-field_f5ba15a']"));
 		Select sc=new Select(reqService);
 		sc.selectByVisibleText("Cruise package");
 		driver.findElement(By.xpath("//*[@id='form-field-field_04d8df8']")).sendKeys("europe");
 		driver.findElement(By.xpath("//*[@id='form-field-field_b344e88']")).sendKeys("4");
 		driver.findElement(By.xpath("//*[@id='form-field-field_e68d28a']")).sendKeys("5");
 		driver.findElement(By.xpath("//*[@id='form-field-field_c0be3f9']")).sendKeys("travl plan");
         
         //date picker
  		  WebElement dd=driver.findElement(By.id("form-field-field_ec10af7"));
          dd.sendKeys("0000-00-00");
          
        
         while(true)
         { 
   	     Thread.sleep(2000);
         WebElement mon= driver.findElement(By.xpath("//*[@class='flatpickr-month']/div[1]/span")); 
   	     String month=mon.getText();
   	     System.out.println("mon: "+month);
   	    
   	  
   	     if(month.equalsIgnoreCase("march"))
   	     {
   		    System.out.println("Pass");
   		    break;
   	     }
   	     else
   	     {
   	    	 Thread.sleep(2000);
   	        driver.findElement(By.xpath("/html/body/div[8]/div[1]/span[2]")).click();    	      
   	     }
   	    
         }
         String dayToFind = "15";

         String xpathExpression = "/html/body/div[8]/div[2]/div/div[2]/div/span[text()='" + dayToFind + "']";                              
         WebElement dayElement = driver.findElement(By.xpath(xpathExpression));
         dayElement.click();

           
	}

}
