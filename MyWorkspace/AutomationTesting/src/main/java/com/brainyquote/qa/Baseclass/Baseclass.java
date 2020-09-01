/**
 * 
 */
package com.brainyquote.qa.Baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




/**
 * @author user
 *
 */
public class Baseclass {

	public static WebDriver driver;
	public static Properties pop;
	
	
	/**
	 * @author Subha
	 * @param
	 */
	
	public Baseclass()
	{
		pop=new Properties();
		try {
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\brainyquote\\qa\\config\\config.properties");
		
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
		
	
	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20000, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
	
	driver.get(pop.getProperty("url"));
		
}
}
