package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtilities 
{
	public static String getexcel(String xl,String sheet,int r,int c) throws FileNotFoundException ,IOException
	{
	  FileInputStream ob=new FileInputStream(xl);
	  XSSFWorkbook wb=new XSSFWorkbook(ob);
	  XSSFCell cl=wb.getSheet(sheet).getRow(r).getCell(c);
	  if(cl.getCellType()==CellType.STRING)
	  {
		  return cl.getStringCellValue();
	  }
	  else
	  {
		  return cl.getRawValue();
	  }	
	
	}
	
	public static int get_rcCounts(String xl,String sheet) throws IOException
    {
		FileInputStream ob=new FileInputStream(xl);
		XSSFWorkbook wb=new XSSFWorkbook(ob);
		int rc= wb.getSheet(sheet).getLastRowNum();
		return rc;	
	}

}
