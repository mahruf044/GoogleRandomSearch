package utlities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadFromXLSFile {

	
	@DataProvider(name="readXLS")
	public Object[][] getData() throws EncryptedDocumentException, IOException, InterruptedException
	{
		LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        
        String excelSheetName=dayOfWeek.toString();
		
		//File f=new File("E:\\testData.xlsx");
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\testData.xlsx");
		FileInputStream fls=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fls);
		Sheet sheetName= wb.getSheet(excelSheetName);
		
		int totalRows=sheetName.getLastRowNum();

		DataFormatter format= new DataFormatter();
		ArrayList<String> testData = new ArrayList<String>();

	    for(int i=2;i<=totalRows;i++) {
	    	testData.add(format.formatCellValue(sheetName.getRow(i).getCell(2)));
		}
	    /*for (String k : testData) {
	        System.out.println(k);
	      }*/
	    Object[][] objData = new Object[1][1];
	    objData[0][0]= testData;

	    return objData;
	}

}
