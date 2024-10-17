package webdrivers;
import org.openqa.selenium.chrome.ChromeDriver;
public class Fstpgm {

	public static void main(String[] args)
	{
      ChromeDriver driver=new ChromeDriver();
      driver.get("https://www.luminartechnolab.com/");
      String actualtitle=driver.getTitle();
      System.out.println(actualtitle);
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
	

}
