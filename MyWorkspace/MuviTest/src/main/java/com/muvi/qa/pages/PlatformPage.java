/**
 * 
 */
package com.muvi.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.muvi.qa.baseclass.BaseClass;

/**
 * @author Subha
 *
 */
public class PlatformPage extends BaseClass {

	@FindBy(xpath="//h1[contains(@class,'font-20 text-center')]")
	WebElement pageheadertext;
	
	@FindBy(id="nextbtn")
	WebElement nextButton;
	
	public PlatformPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String validatePlatformPage()
	{
		return pageheadertext.getText();
	}
	
	public HomePage clickNext()
	{
		nextButton.click();
		
		return new HomePage();
	}
}
