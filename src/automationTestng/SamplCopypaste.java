package automationTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SamplCopypaste
{
	WebDriver driver;
    @BeforeTest
    public void setup()
    {
	  		driver=new ChromeDriver();
    }
    @BeforeMethod
    public void urlLoad()
    {
    	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
    }
    @Test
    public void fun_cpPaste()
    {
    	WebElement fn=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input"));
    	fn.sendKeys("ammu");
    	WebElement mail=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]"));
        Actions act=new Actions(driver);
        act.keyDown(fn, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
        act.keyDown(fn,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
        act.keyDown(mail,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
        act.perform();
        
    	
			
			
    }
    
}
