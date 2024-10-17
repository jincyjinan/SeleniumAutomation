package automationTestng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class GoogleLogo 
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
		driver.get("https://www.google.com/");
	}
	@Test
	public void checkLogo()
	{
		WebElement logo=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
		if(logo.isDisplayed())
		{
			System.out.println("Google logo is present");
		}
		else
		{
			System.out.println("Google logo is not present");
		}
	}
}
