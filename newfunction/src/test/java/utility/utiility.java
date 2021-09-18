package utility;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utiility {
	
	
	public static String fetchFromExcel(int row, int column) throws EncryptedDocumentException, IOException
	{	try 
	{
		String path  = "C:\\Users\\Gopal\\Documents\\sam1211.xlsx";
		FileInputStream file = new FileInputStream(path);
		String value = WorkbookFactory.create(file).getSheet("sam1211").getRow(0).getCell(0).getStringCellValue();
		return value ;

	}
	catch(ArithmeticException a)
	{
		String path  = "C:\\Users\\Gopal\\Documents\\sam1211.xlsx";
		FileInputStream file = new FileInputStream(path);
		double value = WorkbookFactory.create(file).getSheet("sam1211").getRow(0).getCell(0).getNumericCellValue();
		String data = Double.toString(value);
		return data ;

//		System.out.println(value);
//		System.out.println(data);
	}
	}
	
		
	
public static void takeScreenShot(WebDriver driver , String testid) throws IOException
{
	Date thisdate = new Date();
	SimpleDateFormat df = new SimpleDateFormat("MM,dd,y  hh mm a");
	String formate = df.format(thisdate);
	System.out.println(formate);
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest = new File("D:\\newss\\testid" +testid + formate);
	FileHandler.copy(source, dest);

}
}
