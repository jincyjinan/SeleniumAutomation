package automationTestng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUpldPgm
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
    	driver.get("https://www.ilovepdf.com/pdf_to_word");
    	driver.manage().window().maximize();
    }
    @Test
    public void verify_fileUpld() throws AWTException
    {
    	Robot r=new Robot();
    	WebElement wb=driver.findElement(By.xpath("//*[@id='pickfiles']"));
        String fpath="C:\\Users\\hp\\Downloads\\teas.pdf";
        wb.click();     //if fileUpload with edit text field ,we can use wb.sendKeys(fpath);
        
        StringSelection s = new StringSelection(fpath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);   //clipboard access
      
        r.delay(3000);
        r.keyPress(KeyEvent.VK_CONTROL); //Press Ctrl+V
        r.keyPress(KeyEvent.VK_V);
   
        r.keyRelease(KeyEvent.VK_V);     //Release Ctrl+v
        r.keyRelease(KeyEvent.VK_CONTROL);
        
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);  	//press nd relese Enter
    }
    
}
