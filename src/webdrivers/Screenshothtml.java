package webdrivers;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshothtml 
{
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void beforeTest()
	{
		driver.get("file:///C:/Users/hp/Desktop/dispalert.html");	
	}
	@Test
	public void testScreen() throws IOException 
    {
		 
	 File fi=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     FileHandler.copy(fi, new File("C:\\Users\\hp\\Pictures\\screen\\htmlscreen.png"));  //Specify location to store the screenshots
     
	}
	 @After
	 public void afterTest()
	 {
		   
	 }


}
