/**
 * 
 */
package com.muvi.qa.TestCases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.muvi.qa.baseclass.BaseClass;
import com.muvi.qa.pages.FreeTrialFormPage;
import com.muvi.qa.pages.LoginPage;
import com.muvi.qa.util.TestUtil;

/**
 * @author user
 *
 */
public class LoginpageTest extends BaseClass{

	
	LoginPage loginPage;
	FreeTrialFormPage freeTrail;
	TestUtil testutil;
	
	String sheetName="FreeTrail_Form";
	
	public LoginpageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void loginToBrowser()
	{
		initialization();
		 loginPage = new LoginPage();
		 freeTrail=new FreeTrialFormPage();
		 testutil=new TestUtil();
	}
	
	
	
	@Test(priority=1)
	
	public void loginpagevalidation()
	{   
		boolean validate_Muvilogo = loginPage.validate_Muvilogo();
		Assert.assertTrue(validate_Muvilogo);
	}
	
	@Test(priority=2)
	public void loginpagetitel_validation()
	{   
		String actitle = loginPage.validate_LoginPageTitle();
		System.out.println(actitle);
		Assert.assertEquals(actitle, "OTT Platforms, Video Streaming and VoD Platform Provider - Muvi");
	}
	
	@DataProvider
	public Object[][] getFreetrailFormdata()
	{
		Object[][] data=TestUtil.getTestData(sheetName);
		
		return data;
	}
	
	@Test(priority=3,dataProvider="getFreetrailFormdata")
	public void freeTrialTest(String name,String companyName,String phoneNumber,String mailid,String pwd)
	{   
		loginPage.freetrial_click();
	
		freeTrail.inputFreeTrialData(name, companyName, phoneNumber, mailid, pwd);
		
	}
	
	

	
	@AfterMethod
	public void outOfbrowser()
	{
		driver.quit();
	}
	
}
