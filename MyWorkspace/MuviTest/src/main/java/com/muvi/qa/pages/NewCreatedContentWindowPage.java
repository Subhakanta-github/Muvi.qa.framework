/**
 * 
 */
package com.muvi.qa.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.support.PageFactory;

import com.muvi.qa.baseclass.BaseClass;

/**
 * @author user
 *
 */
public class NewCreatedContentWindowPage extends BaseClass {

	
	//Generic xpath
	
	public String validationnewCreatedName(String contentname)
	{
    String actualContent = driver.findElement(By.xpath("//h2[text()='contentname']")).getText();
    
    return actualContent;
	}
	
	public NewCreatedContentWindowPage()
	{
		PageFactory.initElements(driver, this);
	}
}
