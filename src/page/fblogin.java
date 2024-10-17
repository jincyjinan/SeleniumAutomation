package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fblogin 
{
	WebDriver driver;
	By fbname=By.id("email");
	By fbpass=By.id("pass");
	By fbclick=By.name("login");
	
	
	public fblogin(WebDriver d) 
	{
		this.driver=d;
	}
 
	public void check(String mail,String pass)
	{ 
		driver.findElement(fbname).clear();
		driver.findElement(fbname).sendKeys(mail);
		driver.findElement(fbpass).clear();
		driver.findElement(fbpass).sendKeys(pass);
	}
	
	public void clicks()
	{
		driver.findElement(fbclick).click();
	}
}
