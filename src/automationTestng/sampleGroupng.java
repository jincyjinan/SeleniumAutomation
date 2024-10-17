package automationTestng;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class sampleGroupng 
{
	ChromeDriver driver;
	@BeforeTest
	public void fun_BforTest()
	{
		driver=new ChromeDriver();
	}
    @BeforeMethod
    public void fun_Bformeth()
    {
    	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
    }
    
 

}
