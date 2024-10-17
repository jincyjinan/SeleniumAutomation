package test;

import java.io.IOException;
import org.testng.annotations.Test;
import Utilities.excelUtilities;
import page.fblogin;


public class LoginchkFb extends BaseClass
{
	 
	@Test
	public void verify_login() throws IOException
	{
		String xl="D:\\samplSheets\\fblogin.xlsx";
		String sheet="Sheet1";
		fblogin fb=new fblogin(driver);
		int rc= excelUtilities.get_rcCounts(xl, sheet);
		for(int i=1;i<=rc;i++)
		{
			String uname= excelUtilities.getexcel(xl, sheet, i, 0);
			System.out.println("uname: "+uname);	
			String pass=excelUtilities.getexcel(xl, sheet, i, 1);
			System.out.println("pass: "+pass);
			fb.check(uname, pass);
		    fb.clicks();		
		}		
	}
}		
	


/*public void verify_login() throws IOException
	{
	   fbLoginchk fb=new fbLoginchk(driver);
	   FileInputStream ob=new FileInputStream("D:\\samplSheets\\fblogin.xlsx");
	   XSSFWorkbook wb=new XSSFWorkbook(ob);
	   XSSFSheet sh=wb.getSheet("Sheet1");
	   int rc=sh.getLastRowNum();
	   for(int i=1;i<=rc;i++)
	   {
	     try
	     {
	    	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    		String uname= sh.getRow(i).getCell(0).getStringCellValue();
	    		String pswd=sh.getRow(i).getCell(1).getStringCellValue();
	    	    fb.loginchk(uname, pswd);
	    	    fb.clicks();
	    		
	     } 		
	     catch(Exception ex)
	     {   }    		
	   }
	    wb.close();	
	 }*/

