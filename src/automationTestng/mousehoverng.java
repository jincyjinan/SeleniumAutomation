package automationTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mousehoverng 
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
    	driver.get("https://www.ebay.com/");
    	driver.manage().window().maximize();
    }
    @Test
    public void dragDtop()
    {
    	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// implicit wait
    	WebElement elect=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
    	Actions act=new Actions(driver);
    	act.moveToElement(elect).perform();
    	//explicit wait
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
    	//WebElement wb=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")));
    	//wb.click();
    	WebElement mob=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"));
    	wait.until(ExpectedConditions.visibilityOf(mob));
    	mob.click();
    	
    	
    }
    
    
}
