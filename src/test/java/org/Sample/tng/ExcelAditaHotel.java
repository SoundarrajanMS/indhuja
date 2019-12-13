package org.Sample.tng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAditaHotel {
	public static void main(String[] args) throws Throwable {
		File F= new File("C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Induja\\Excel\\AdictaHotel.xlsx");
	FileInputStream FIS = new FileInputStream(F);
	Workbook W = new XSSFWorkbook(FIS);
	   Sheet S = W.getSheet("sheet1");
	   for(int i=0;i<S.getPhysicalNumberOfRows();i++) {
		   Row r = S.getRow(i);
	  for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
		  Cell C = r.getCell(j);
		
	  }
	}}
}
