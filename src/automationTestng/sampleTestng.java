package automationTestng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleTestng 
{
	ChromeDriver driver;
	@BeforeTest (alwaysRun = true)
	public void fun_bforTest()
	{
		driver=new ChromeDriver();
	}
    @BeforeMethod (alwaysRun = true)
    public void fun_bforMeth()
    {
    	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
    }
    @Test (groups = {"sanity"})
    public void testHead() 
    {
       System.out.println("sanity 1");
       String logoText=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).getAttribute("title");
	   System.out.println("Logo Txt: "+logoText);
			  
    }
    @Test (groups = {"smoke"})
    public void testbutn() 
    {
    	System.out.println("smoke");
    	String btnText=driver.findElement(By.xpath("//*[@id='Register']")).getAttribute("value");
		System.out.println("Button Txt: "+btnText);
    }
    @Test (groups = {"sanity"})
    public void testemail()
    {
    	 System.out.println("sanity 2");
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
