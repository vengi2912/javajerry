package AutomationTestpage.org.automation.testpage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excelread {
	@Test
	public void exceclreader() throws Exception {
	File file =    new File("C:\\Users\\vmurrug\\Downloads\\dec_bill.xlsx");
	FileInputStream inputStream = new FileInputStream(file);
	System.out.println(inputStream);
	
	//XSSWorkbook xlsxbook= new XSSWorkbook(inputStream);
//	HSSFWorkbook wb=new HSSFWorkbook(inputStream);
	
	XSSFWorkbook xlsxbook = new XSSFWorkbook(inputStream);
	System.out.println(xlsxbook);
	
	XSSFSheet sheet = xlsxbook.getSheetAt(0);
	
	Header heading = sheet.getHeader();
	System.out.println(heading);
	
	System.out.println(sheet);
	
	}
}
