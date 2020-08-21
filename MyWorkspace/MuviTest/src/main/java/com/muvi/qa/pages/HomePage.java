/**
 * 
 */
package com.muvi.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.muvi.qa.baseclass.BaseClass;

/**
 * @author Subha
 *
 */
public class HomePage extends BaseClass {
	
	@FindBy(xpath="//em[contains(@class,'icon-film left-icon')]")
	@CacheLookup
	WebElement manageContent;
	
	@FindBy(xpath="//a[contains(text(),'Content Library')]")
	@CacheLookup
	WebElement contentLibrary;
	
	
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateCurrentUrl()
	{
		String currentUrl = driver.getCurrentUrl();
		
		return currentUrl;
	}
	
	public void goToContentLibrary()
	{
		Actions act=new Actions(driver);
		act.moveToElement(manageContent).build().perform();
		contentLibrary.click();
	}
	
	
	

}
