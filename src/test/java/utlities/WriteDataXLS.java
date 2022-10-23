package utlities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.DayOfWeek;
import java.time.LocalDate;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataXLS {
	public static void writeExcel(String[][] obj) throws IOException {
		InputStream inp = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\testData.xlsx");
		//InputStream inp = new FileInputStream("workbook.xlsx");
		
		Workbook wb = WorkbookFactory.create(inp);
		LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        String excelSheetName=dayOfWeek.toString();
		Sheet sheet = wb.getSheet(excelSheetName);
		for(int i=0;i<obj.length;i++) {
				Row row = sheet.getRow(i+2);
				Cell cellA = row.getCell(3);
				Cell cellB = row.getCell(4);
				if (cellA == null) {
					cellA = row.createCell(3);
					
				}
					
				cellA.setCellValue(obj[i][0]);
				
				if (cellB == null) {
					cellB = row.createCell(4);
					}
				    
					cellB.setCellValue(obj[i][1]);
				
			}
			
		 
		// Write the output to a file
		FileOutputStream fileOut = new FileOutputStream (System.getProperty("user.dir")+"\\src\\test\\resources\\testData.xlsx");
		wb.write(fileOut);
		fileOut.close();
		System.out.println("Done");
		
	}
}


