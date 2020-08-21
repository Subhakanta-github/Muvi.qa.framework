/**
 * 
 */
package com.muvi.qa.TestCases;

import org.testng.annotations.Test;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.muvi.qa.baseclass.BaseClass;
import com.muvi.qa.pages.AddContentPage;
import com.muvi.qa.pages.ContentLibraryPage;
import com.muvi.qa.pages.HomePage;
import com.muvi.qa.pages.LoginPage;
import com.muvi.qa.pages.NewCreatedContentWindowPage;
import com.muvi.qa.util.TestUtil;

/**
 * @author user
 *
 */
public class ContentTest extends BaseClass {

	LoginPage loginpage;
	HomePage homepage;
	ContentLibraryPage contentlibrarypage;
	AddContentPage addcontentpage;
	TestUtil testUtil;
	NewCreatedContentWindowPage newCreatedContentWindowPage;
	
	public ContentTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void loginTOBrowser()
	{
		initialization();
		
		loginpage=new LoginPage();
		homepage=new HomePage();
		contentlibrarypage=new ContentLibraryPage();
		addcontentpage=new AddContentPage();
		testUtil = new TestUtil();
		newCreatedContentWindowPage= new NewCreatedContentWindowPage();
		loginpage.login(pop.getProperty("username"), pop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void validateHomepage()
	{
		String validateCurrentUrl = homepage.validateCurrentUrl();
		
		Assert.assertEquals(validateCurrentUrl, "https://cms.muvi.com/admin/dashboard");
	}
	
	
	
	@Test(priority=2)
	public void goToContentLibrary()
	{
		homepage.goToContentLibrary();
		addcontentpage.inputcontentData(pop.getProperty("contentName"), pop.getProperty("listoptions"));
		
	}
	
	@Test(priority=3)
	public void ccontentvalidation()
	{
		homepage.goToContentLibrary();
		contentlibrarypage.clickContentName(pop.getProperty("contentName"));
		//Switch to new tab
		
		testUtil.childWindow();
		String validationnewCreatedName = newCreatedContentWindowPage.validationnewCreatedName(pop.getProperty("contentName"));
		
		Assert.assertEquals(validationnewCreatedName, pop.getProperty("contentName"));
		//Back to mainwindow
		
		testUtil.mainWindow();
	    
	}
	
	
	@AfterMethod
	public void outOfBrowser()
	{
		driver.quit();
	}
}
