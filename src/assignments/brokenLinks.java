package assignments;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class brokenLinks 
{   WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
    @BeforeMethod
    public void url_load()
    {
    	driver.get("https://www.amazon.in/");
    	driver.manage().window().maximize();
    }
    @Test
    public void verify_link() throws IOException
    {
    	  List<WebElement> li=driver.findElements(By.tagName("a"));
		  System.out.println("links no: "+li.size());
		  for(WebElement s:li)
		  {
			  try
			  {  
			  String links=s.getAttribute("href");
			  URL ur=new URL(links);
			  HttpURLConnection con = (HttpURLConnection) ur.openConnection();
			  con.setConnectTimeout(3000);
			  con.connect();
			  int respcode=con.getResponseCode();  
			    if (respcode>=400)
			    {
				  System.out.println("Broken link. "+con.getResponseCode()+" "+links);
			    }
			    else
			    {
				  System.out.println("Valid link. ");
			    }
			  }
			  catch (Exception ex)
			  {  System.out.println("exception");  }
		  }
    	}
      @AfterTest
      public void end()
      {}    
}