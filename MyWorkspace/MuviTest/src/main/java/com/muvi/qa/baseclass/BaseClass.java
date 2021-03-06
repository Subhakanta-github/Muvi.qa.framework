package com.muvi.qa.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.muvi.qa.util.TestUtil;
import com.muvi.qa.util.WebEventListener;

/**
 * 
 * @author Subha
 */
public class BaseClass {

	public static WebDriver driver;
	public static Properties pop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	/**
	 * @author Subha
	 * @param
	 */
	
	public BaseClass()
	{
		pop=new Properties();
		try {
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/muvi/qa/config/config.properties");
		
		pop.load(ip);
		} 
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
       
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		}
		  

public static void initialization()
{
	String browserName = pop.getProperty("browser");
	
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "E:\\MyWorkspace\\MuviTest\\resource\\chromedriver.exe");	
		driver = new ChromeDriver(); 
	}
	else if(browserName.equals("Firefox")){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\chromedriver_win32 (1)");	
		driver = new FirefoxDriver(); 
	}
		
	
	e_driver = new EventFiringWebDriver(driver);
	eventListener = new WebEventListener();
	e_driver.register(eventListener);
	driver = e_driver;
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
	driver.get(pop.getProperty("url"));
		
}
}

