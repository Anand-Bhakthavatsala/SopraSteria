package seleniumscripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// How to read data from excel sheet
		FileInputStream fis = new FileInputStream("D:\\Automation\\AutomationData.xlsx");

		//Identify the workbook in the excel
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Selenium");//workbook.getSheetAt(0);
		int rows = sheet.getPhysicalNumberOfRows();//to get the count of rows
		System.out.println(rows);//records

		//to find the no: of columns
		int columns = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(columns);//records

		String cell = sheet.getRow(8).getCell(0).getStringCellValue();
		System.out.println(cell);


		for(int i=0;i<=rows;i++) 
		{ 
			for(int j=0;i<columns;j++) 
			{
				String cellData = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(cellData);
			} 
		}


		/*
		 * //Write some data to the particular cell XSSFRow row = sheet.getRow(8);//9th
		 * record XSSFCell cell2 = row.getCell(1);//2nd colm
		 * cell2.setCellValue("Bangalore");
		 * 
		 * FileOutputStream fos = new
		 * FileOutputStream("D:\\Automation\\AutomationData.xlsx"); workbook.write(fos);
		 * 
		 * System.out.println(cell2);
		 */

	}

}
