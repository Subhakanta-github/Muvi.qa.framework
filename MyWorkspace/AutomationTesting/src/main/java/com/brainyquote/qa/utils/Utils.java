/**
 * 
 */
package com.brainyquote.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.brainyquote.qa.Baseclass.Baseclass;

/**
 * @author user
 *
 */
public class Utils extends Baseclass{

	
	
	
	public void importExcellData(String sheetName,int row,int col,String data) throws FileNotFoundException, IOException, InvalidFormatException
	{
	String path="\\src\\main\\java\\com\\brainyquote\\qa\\testdata\\Data.xlsx";
	FileInputStream file=new FileInputStream(path);
	
	Workbook wb = WorkbookFactory.create(file);
	Sheet sheet = wb.getSheet(sheetName);
	Row row2 = sheet.getRow(row);
	Cell cell = row2.getCell(col);
	cell.setCellValue(data);
	
	FileOutputStream fos=new FileOutputStream(path);
	wb.write(fos);
	
	
	
	}
}
