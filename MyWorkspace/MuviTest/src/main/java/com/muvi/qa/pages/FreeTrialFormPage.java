/**
 * 
 */
package com.muvi.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.muvi.qa.baseclass.BaseClass;

/**
 * @author Subha
 *
 */

public class FreeTrialFormPage extends BaseClass {

	
	@FindBy(id="name")
	@CacheLookup
	WebElement inputName;
	
	@FindBy(id="companyname")
	@CacheLookup
	WebElement inputCompanyname;
	
	@FindBy(name="phone")
	@CacheLookup
	WebElement inputPhone;
	
	@FindBy(id="email")
	@CacheLookup
	WebElement inputemail;
	
	@FindBy(id="inputPassword")
	@CacheLookup
	WebElement inputpassword;
	
	@FindBy(xpath="//button[contains(text(),'Free Trial']")
	WebElement freeTrial;
	
	@FindBy(xpath="//label[@class='custom-control-label']")
	WebElement agreeCheckbox;
	
	@FindBy(id="nextbtn")
	WebElement nextButton;
	
	@FindBy(xpath="//h1[contains(@class,'font-20 text-center')]")
	WebElement daystrial_text;
	
	
	public FreeTrialFormPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateFreetrialtext()
	{
		return daystrial_text.getText();
	}
	
	
	public HomePage inputFreeTrialData(String name,String companyName,String phoneNumber,String mailid,String pwd)
	{    freeTrial.click();
		inputName.sendKeys(name);
		inputCompanyname.sendKeys(companyName);
		inputPhone.sendKeys(phoneNumber);
		inputemail.sendKeys(mailid);
		inputpassword.sendKeys(pwd);
		
		agreeCheckbox.click();
		nextButton.click();
		
		return new HomePage();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
