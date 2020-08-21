/**
 * 
 */
package com.muvi.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.muvi.qa.baseclass.BaseClass;

/**
 * @author user
 *
 */
public class AddContentPage extends BaseClass{

	@FindBy(xpath="//h3[@class='text-capitalize f-300']")
	WebElement AddContent_HeaderText;
	
	@FindBy(id="mname")
	@CacheLookup
	WebElement conetntName;
	
	@FindBy(id="content_category_value")
	WebElement ConetntCatagory_Dropdown;
	
	@FindBy(id="save-btn")
	WebElement savencontinueButton;
	
	public AddContentPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inputcontentData(String name,String listoptions)
	{
		conetntName.sendKeys(name);
		
		Select sel=new Select(ConetntCatagory_Dropdown);
		sel.selectByVisibleText(listoptions);
		
		savencontinueButton.click();
		
	}
	
}
