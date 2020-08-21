/**
 * 
 */
package com.muvi.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.muvi.qa.baseclass.BaseClass;

/**
 * @author Subha
 *
 */
public class TestUtil extends BaseClass{

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;

	public static String TESTDATA_SHEET_PATH = "src\\main\\java\\com\\muvi\\qa\\testdata\\MuviTestData.xlsx";
			
	
	static Workbook book;
	static Sheet sheet;
	
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "./Screenshot/" + System.currentTimeMillis() + ".png"));
	}
	
	/*
	 * For Data Driven approach
	 */
	public static Object[][] getTestData(String sheetName)
	{
		FileInputStream file=null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				
			}
		}
		return data;
	}
	
	/*
	 * Alert popup 
	 */
	public Alert alert_popup()
	{
		Alert alert = driver.switchTo().alert();
		return alert;
	}
	
	/*
	 * New Window Handle
	 */
	public WebDriver mainWindow()
	{
		String parentwindow = driver.getWindowHandle();
		WebDriver parenttab = driver.switchTo().window(parentwindow);
		
		return parenttab;
	}
	
	public WebDriver childWindow()
	{
		Set<String> set = driver.getWindowHandles();
		
		Iterator<String> it = set.iterator();
		
		String parentwindow = it.next();
		String childwindow1 = it.next();
		
		WebDriver childtab = driver.switchTo().window(childwindow1);
		 
		return childtab;
	}
	

}
