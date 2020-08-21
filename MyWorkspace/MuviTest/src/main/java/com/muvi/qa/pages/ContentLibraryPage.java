/**
 * 
 */
package com.muvi.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.muvi.qa.baseclass.BaseClass;

/**
 * @author user
 *
 */
public class ContentLibraryPage extends BaseClass {
	
	@FindBy(xpath="//h3[text()='Content Library']")
	WebElement conetentLibarary_HeaderText;
	
	@FindBy(xpath="//button[contains(text(),'Add Content')]")
	@CacheLookup
	WebElement addContact;
	
	public ContentLibraryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Generic xpath
	
	public void clickContentName(String contentname)
	{
    driver.findElement(By.xpath("//div[contains(text(),'"+contentname+"')]")).click();
	}
	
	
	
	
	
	

}
