package assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fileUpRobot 
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}
	@Test
	public void uplod() throws AWTException
	{
		WebElement bt=driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span"));
		bt.click();
		String fpath="C:\\Users\\hp\\Downloads\\teas.pdf";
		
		StringSelection ss=new StringSelection(fpath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot r=new Robot();
		r.delay(2000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}

}
