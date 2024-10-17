package automationTestng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SamplPara 
{
  @Parameters("s")
  @Test
  public void print(String s)
  {
	  System.out.println(s);
  }
}
