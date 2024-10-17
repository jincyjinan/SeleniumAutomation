package automationTestng;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fbLogin 
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
    	driver.get("https://www.facebook.com/login/");
    }
    @Test
    public void verify_login() throws IOException
    {
    	FileInputStream ob=new FileInputStream("D:\\samplSheets\\fblogin.xlsx");
    	XSSFWorkbook wb=new XSSFWorkbook(ob);
    	XSSFSheet sh=wb.getSheet("Sheet1");
    	int rc=sh.getLastRowNum();
    	for(int i=1;i<=rc;i++)
    	{
    		try
    		{
    	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    		String uname= sh.getRow(i).getCell(0).getStringCellValue();
    		String pswd=sh.getRow(i).getCell(1).getStringCellValue();
    		System.out.println(pswd);
    		driver.findElement(By.id("email")).clear();
    		driver.findElement(By.id("email")).sendKeys(uname);
    		driver.findElement(By.id("pass")).clear();
    		driver.findElement(By.id("pass")).sendKeys(pswd);
    		driver.findElement(By.name("login")).click();
    		} 		
    		catch(Exception ex)
    		{
    			
    		}
    		
    	}
    	
    	
    }
    

}
