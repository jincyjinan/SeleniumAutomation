package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class fbCreatPage 
{
	WebDriver driver;
	By creatpg=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By businesButn=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div");
	
	public fbCreatPage(WebDriver d)
	{
		this.driver=d;
	}
   
	public void linktest() 
	{
		driver.findElement(creatpg).click();
	}
	
	public void btnclk()
	{
		driver.findElement(businesButn).click();
	}
}
