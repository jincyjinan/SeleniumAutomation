package automationTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentRepoPgm 
{
	WebDriver driver;
	String baseurl="https://www.facebook.com/";
	ExtentHtmlReporter rep;
	ExtentTest test;
	ExtentReports ext;
	@BeforeTest
	public void fun_report()
	{
		driver.get("https://www.facebook.com");
		rep=new ExtentHtmlReporter("./Reports/pjtReport.html");
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

}
