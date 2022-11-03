package utility;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.time.temporal.TemporalAccessor;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
   
	public static String fetchdatafromexcelsheet(String sheet,int row,int cell) throws EncryptedDocumentException, IOException 
   {
	   FileInputStream file=new FileInputStream("D:\\excelsheet.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		 try {  
		 String data = sh.getRow(0).getCell(0).getStringCellValue();
	
	 return data;		 }
		 catch(Exception e) {
			 double data = sh.getRow(0).getCell(0).getNumericCellValue();
		     
			 String a = Double.toString(data);
		
			 
				return a;
		 }
		 
	  
   }
   public static void capturescreenshot(WebDriver driver, int testid) throws IOException {
   
   	   SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd, HH-mm-ss");
	   Date date= new Date();
       String time = formatter.format(date);	
        
	   File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       File destination =new File("D:\\hi\\Demo"+testid + time+ ".jpg");
	   FileHandler.copy(source, destination);
	}
	
}