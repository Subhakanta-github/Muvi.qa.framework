/**
 * 
 */
package com.brainyquote.qa.Testcases;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.brainyquote.qa.Baseclass.Baseclass;
import com.brainyquote.qa.utils.Utils;

/**
 * @author user
 *
 */
public class AuthorsTest extends Baseclass {

	Utils util;
	@BeforeMethod
	public void gotoPage()
	{
		initialization();
		util=new Utils();
	}
	@Test
	public void fetch_All_AuthorsName()
	{
		List<WebElement> allAuthorNames = driver.findElements(By.xpath("//a[contains(@href,'/authors/') and @class='bq_on_link_cl']"));
		
		String text="";String actualAuthorQuotesPage="";
		for(int i=0;i<allAuthorNames.size();i++)
		{
			WebElement element = allAuthorNames.get(i);
			text = element.getText();
	//System.out.println(text);
	

	if(text.contains(pop.getProperty("author")))
	
	{

		System.out.println("Specific Author-----"+text);
		
		element.click();
		 actualAuthorQuotesPage = driver.findElement(By.xpath("//h1[@class='bq-subnav-h1']")).getText();
		
		break;
		
	}
	
		
	else if(actualAuthorQuotesPage.contains(pop.getProperty("author")))
	{
		
		List<WebElement> allTagElement = driver.findElements(By.xpath("//div[contains(@class,'m-brick grid-item boxy bqQt qll-new-bg r-width')]"));
	
for (WebElement webElement : allTagElement) {
			
			String quoteText="",tagText="";
			
			 tagText = webElement.getText();
			 
			 if(tagText.contains(pop.getProperty("tags")))
				{
					System.out.println(tagText);
					break;
				}
			 
				else  {
					
					List<WebElement> allQuoteElement = driver.findElements(By.xpath("//div[contains(@class,'m-brick grid-item boxy bqQt r-width')]"));

					for (WebElement webElement2 : allQuoteElement) {
								
						quoteText = webElement2.getText();
									 System.out.println(quoteText);
					}
			}
	}
	}
	}
	
	}
	
	@Test
	public void importAllData() throws InvalidFormatException, IOException
	{
List<WebElement> allAuthorNames = driver.findElements(By.xpath("//a[contains(@href,'/authors/') and @class='bq_on_link_cl']"));
		
		String text="";String actualAuthorQuotesPage="";
		for(int i=0;i<allAuthorNames.size();i++)
		{
			WebElement element = allAuthorNames.get(i);
			text = element.getText();
	//System.out.println(text);
	

	if(text.contains(pop.getProperty("author")))
	
	{

		System.out.println("Specific Author-----"+text);
		
		element.click();
		
		
		break;
		
	}
	
	
	
	
	List<WebElement> allquotes = driver.findElements(By.xpath("//div[contains(@class,'m-brick grid-item boxy bqQt qll-new-bg r-width')]"));;
	
	for (int k=0;k<allquotes.size();k++) {
		
	String quotes = allquotes.get(k).getText();
	
	util.importExcellData("Sheet1", k, 1, pop.getProperty("author"));
		
		util.importExcellData("Sheet1", k, 2, quotes);
	}	
		
	
	
	List<WebElement> alltags = driver.findElements(By.xpath("//div[contains(@class,'m-brick grid-item boxy bqQt qll-new-bg r-width')]"));
		
	for (int l=0;l<alltags.size();l++) {
		
		String tags = alltags.get(l).getText();
			
			util.importExcellData("Sheet1", l, 3, tags);
		}
	
	}}
	
	
	
		
		
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
