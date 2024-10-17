package automationTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestActions 
{
 WebDriver driver;
 @BeforeTest
 public void setup()
 {
	 driver=new ChromeDriver();
 }
 @BeforeMethod
 public void load_url()
 {
	 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
 }
 @Test
 public void alert_action()
 {
	 WebElement fbtn=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	 Actions act=new Actions(driver);
	 act.contextClick(fbtn).perform();   
	 driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
	 driver.switchTo().alert().accept();
	 
	 WebElement sbtn=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	 act=new Actions(driver);
	 act.doubleClick(sbtn).perform();
	 driver.switchTo().alert().accept();
	 
 }

}
