package webdrivers;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotFb 
{
	ChromeDriver driver=new ChromeDriver();
   @Before
    public void beforeTest()
    {
	driver.get("https://www.facebook.com/login/");	
     }
    @Test
    public void testScreen() throws IOException 
    {
	   WebElement obj=driver.findElement(By.xpath("//*[@id=\"loginbutton\"]"));
       File fi=((TakesScreenshot)obj).getScreenshotAs(OutputType.FILE);
       FileHandler.copy(fi, new File("C:\\Users\\hp\\Pictures\\screen\\log.png"));  //Specify location to store the screenshots
 
    }
 @After
 public void afterTest()
 {
	   
 }
}
