package webdrivers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
public class SamplAnnotate 
{
   ChromeDriver driver=new ChromeDriver();
   
   @Before
   public void BeforAnnotate()
   {
	   driver.get("https://www.luminartechnolab.com/");
   }
   @Test
   public void testAnnotate()
   {
	   String actualtitle=driver.getTitle();
	   String title="Luminar";
	   if(actualtitle.equals(title))
	   {
		   System.out.println("Pass");
	   }
	   else
	   {
		   System.out.println("Fail");
	   }
   }  
   @After
   public void AfterAnnotate()
   {
	   driver.quit();
   }
}
