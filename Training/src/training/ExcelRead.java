package training;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C:/Users/ambaa/Documents/ExcelTest.xlsx");

		try (XSSFWorkbook workbook = new XSSFWorkbook(file)) {
			XSSFSheet sheet = workbook.getSheetAt(0);
			int rownum = sheet.getLastRowNum();
			int colnum = sheet.getRow(0).getLastCellNum();
			for(int i=0;i<=rownum;i++) {
				XSSFRow currentrow = sheet.getRow(i);
				/**for(int j=0;j<colnum;j++) {
					String value = currentrow.getCell(j).toString();
					System.out.print(value+"  "); **/
				
				XSSFCell name = currentrow.getCell(0);
				String name1 = name.getStringCellValue();
				System.out.print(name1+ " ");
				
				XSSFCell num = currentrow.getCell(1);
				int num1 = (int) num.getNumericCellValue();
				System.out.println(num1+ " ");
				} System.out.println();
			}
		}
		}
	

