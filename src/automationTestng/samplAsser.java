package automationTestng;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class samplAsser 
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
    	driver.get("https://www.facebook.com");
    	driver.manage().window().maximize();
    }
    @Test
    public void Title_verify()
    {
    	String act=driver.getTitle();
    	String exp="fb";
    	/*if(act.equals(exp))
    	{
    		System.out.println("Title Verified");
    	}
    	else
    	{
    		System.out.println("Title wrong");
    	}*/
        //Assert.assertEquals(act, exp); //Hard assertion
    	SoftAssert soft=new SoftAssert();
    	soft.assertEquals(act, exp);
    }
    
    

}
