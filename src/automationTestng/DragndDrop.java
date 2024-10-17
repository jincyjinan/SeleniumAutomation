package automationTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragndDrop
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
    	driver.get("https://demoqa.com/droppable/");
    }
    @Test
    public void dragDtop()
    {
    	WebElement dr=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
    	WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
    	Actions act=new Actions(driver);
    	act.dragAndDrop(dr, drop).perform();
    	
        String text=drop.getText();
        String actText="Dropped!";
       // System.out.println(text);
       if(text.equalsIgnoreCase(actText))
       {
    	   System.out.println("Text Changed");
       }
       else
       {
    	   System.out.println("Text not Changed");
       }
    	
    }
}
