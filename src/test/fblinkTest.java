package test;


import org.testng.annotations.Test;

import page.fbCreatPage;

public class fblinkTest extends BaseClass 
{
	
	@Test
	public void check() throws InterruptedException
	{
		fbCreatPage ob=new fbCreatPage(driver);
		ob.linktest();
		Thread.sleep(2000);
		ob.btnclk();
	}
	
	
}
