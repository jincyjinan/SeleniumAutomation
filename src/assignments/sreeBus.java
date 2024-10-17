package assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sreeBus
{
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void loadUrl()
	{
		driver.get("https://www.ubctravels.com/index.html");
		driver.manage().window().maximize();
	}
	@Test
	public void checkLogo()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    WebElement pop=driver.findElement(By.xpath("//*[@id=\"close\"]/img"));
	    pop.click();
	    WebElement dr=driver.findElement(By.xpath("//*[@id=\"search-destination\"]/div[1]/div/div/div[1]"));
	    dr.click();
		WebElement org=driver.findElement(By.xpath("//*[@id=\"search-destination\"]/div[2]/div/div/div/ul/li[3]"));
		org.click();
	}

}
