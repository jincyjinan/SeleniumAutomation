package automationTestng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentReport 
{
	WebDriver driver;
	String baseurl="https://www.facebook.com/";
	ExtentHtmlReporter rep;
	ExtentTest test;
	ExtentReports ext;
	@BeforeTest 
	public void fun_report()
	{
		rep=new ExtentHtmlReporter("./Report/pjtReport.html");
		rep.config().setDocumentTitle("Auto_Testing Report");
		rep.config().setReportName("project1");
		rep.config().setTheme(Theme.STANDARD);
		ext=new ExtentReports();
		ext.attachReporter(rep);
		ext.setSystemInfo("Host", "Local host");
		ext.setSystemInfo("Os","Windows");
		ext.setSystemInfo("Tester Name","Jincy");
		driver=new ChromeDriver();
	}
	@BeforeMethod 
	public void load_url()
	{
		driver.get(baseurl);
	}
	@Test (priority = 1)
	public void title_chk()
	{
		test=ext.createTest("Fb title");
		String tit=driver.getTitle();
		if(tit.equalsIgnoreCase("Facebook – log in or sign up"))
		{
			System.out.println("Title is present");
		}
		else
		{
			System.out.println("Title is not present");
		}
	}
	@Test(priority = 2)
	public void print_screen() throws IOException
	{
		test=ext.createTest("Logo Screenshot");
		WebElement we=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img"));	 
		 File fi=((TakesScreenshot)we).getScreenshotAs(OutputType.FILE);
	     FileHandler.copy(fi, new File("C:\\Users\\hp\\Pictures\\screen\\fblogo.png")); 

	}
	@Test (priority = 3)
	public void verify_login1() 
	{ 
		test=ext.createTest("Verify login");
	    driver.findElement(By.id("email")).sendKeys("abc@123");
	    driver.findElement(By.id("pass")).sendKeys("123asd");
	    driver.findElement(By.name("login")).click();
		
	}

	@AfterTest
	public void verify()
	{
		ext.flush();
		driver.quit();
	}
	
	
}
