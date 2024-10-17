package webdrivers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class samplTestng 
{
	ChromeDriver driver;
	@BeforeTest
	public void testBefore()
	{
		driver=new ChromeDriver();
	}
    @BeforeMethod
    public void methodBfor()
    {
    	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
    }
    @Test (priority = 1, groups = "smoke")
    public void testHead()
    {
    	 WebElement w=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		 String txt=w.getAttribute("title");
		 System.out.println("Logo: "+txt);
			  
    }
    @Test (priority = 3,groups = "sanity")
    public void testbutn()
    {
    	 String btnText=driver.findElement(By.xpath("//*[@id='Register']")).getAttribute("value");
		 System.out.println("Button Txt: "+btnText);
    }
    @Test (priority = 2 ,groups = "smoke")
    public void testemail()
    {
    	WebElement w=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]"));
		  String txt=w.getAttribute("value");
		  String chk_txt="Check availability";
		  if(chk_txt.equals(txt))
		  {
			  System.out.println("Pass");
		  }
		  else
		  {
			  System.out.println("Fail");
		  }		
    }
}
