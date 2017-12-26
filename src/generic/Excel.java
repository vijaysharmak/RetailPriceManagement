package generic;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import exceptions.ExcelException;

public class Excel {

	// This method is used to get the number of row count in the excel sheet.
	// It will fetch the last row number.
	public static int getRowCount(String path, String sheet) {
		int rowCnt=0;
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			rowCnt= wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e) {
			throw new ExcelException("Unable to access Excel");			
		}
		return rowCnt;		
	}
	
	// This method is used to get the value from the cell in String format.
	public static String getCellValue(String path, String sheet, int r, int c) {
		String cellVal="";
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			cellVal = wb.getSheet(sheet).getRow(r).getCell(c).toString();
		}
		catch(Exception e) {
			throw new ExcelException("Unable to access Excel");
		}
		return cellVal;
	}
	
	// This method is to write the value in an excel sheet in a specified row and column.
	public static void writeData(String path, String sheet, int row, int col, String data) {
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			wb.getSheet(sheet).createRow(row).createCell(col).setCellValue(data);
		}
		catch(Exception e) {
			throw new ExcelException("Unable to write data into the excel");
		}
	}

}
