package webdrivers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestReddif 
{
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void beforeTest()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	 @Test
	   public void testLogin()
	   {
		  WebElement w=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]"));
		  //WebElement w=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));//Copy xpath dirctly
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
		  //Small letter text
		  String textLo=txt.toLowerCase();
		  String chk_txt1="check availability";
		  if(chk_txt1.equals(textLo))
		  {
			  System.out.println("Small letters Pass");
		  }
		  else
		  {
			  System.out.println("Small letters Fail");
		  }
	   }
	 @After
	   public void AfterLogin()
	   {
		   
	   }
	 
		  
}
