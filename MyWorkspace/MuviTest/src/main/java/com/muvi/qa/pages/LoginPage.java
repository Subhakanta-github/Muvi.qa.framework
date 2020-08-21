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
public class LoginPage extends BaseClass {
	
	@FindBy(xpath="//img[contains(@src,'https://www.muvi.com/wp-content/plugins/convertplug/modules/assets/images/default.png')]")
    WebElement closeLink;
	
	@FindBy(xpath="//button[contains(@class,'btn btn-primary my-2 my-sm-0')]")
	WebElement freeTrial;
	
	@FindBy(id="load_login")
	WebElement login_link;
	
	@FindBy(xpath="//img[contains(@src,'/wp-content/themes/muvi/images/muvi-logo.svg')]")
	WebElement muviLogo;
	
	@FindBy(id="LoginForm_email")
	WebElement userName;
	
	@FindBy(id="LoginForm_password")
	WebElement password;
	
	@FindBy(xpath="//label[@class='custom-control-label']")
	WebElement remember_Checkbox;
	
	@FindBy(id="btn-login")
	WebElement loginButton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean validate_Muvilogo()
	{
		return muviLogo.isDisplayed();
	}
	
	public String validate_LoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public  FreeTrialFormPage freetrial_click()
	{
		freeTrial.click();
		
		return new FreeTrialFormPage();
	}
	
	public HomePage login(String un, String pwd)
	{
		closeLink.click();
		login_link.click();
		
		userName.sendKeys(un);
		password.sendKeys(pwd);
		remember_Checkbox.click();
		loginButton.click();
		return new HomePage();
		
	}

	
	
}
