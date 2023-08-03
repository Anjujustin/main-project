package orgictkerala.utility;
import java.io.IOException;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.devtools.v111.debugger.Debugger.GetScriptSourceResponse;


public class Excelutility2 {
	
		public static XSSFWorkbook excelWbook;
		public static XSSFSheet excelSheet;

		public static String getData(int rowNum,int colNum) throws IOException
		//public static void main(String[] args) throws IOException {
		 {
			FileInputStream inp = new FileInputStream("D:\\Digitalresumebulder1project\\src\\main\\resources\\values.xlsx");
			excelWbook = new XSSFWorkbook(inp);
			excelSheet = excelWbook.getSheetAt(0);
			//System.out.println(excelSheet.getRow(0).getCell(0).getStringCellValue());
			//System.out.println(excelSheet.getRow(0).getCell(1).getStringCellValue());
			return excelSheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			
		}}

		

