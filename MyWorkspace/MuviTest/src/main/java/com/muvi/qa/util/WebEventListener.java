/**
 * 
 */
package com.muvi.qa.util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.muvi.qa.baseclass.BaseClass;

/**
 * @author Subha
 *
 */
public class WebEventListener extends BaseClass implements WebDriverEventListener {

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#afterAlertAccept(org.openqa.selenium.WebDriver)
	 */
	public void afterAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#afterAlertDismiss(org.openqa.selenium.WebDriver)
	 */
	public void afterAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#afterChangeValueOf(org.openqa.selenium.WebElement, org.openqa.selenium.WebDriver, java.lang.CharSequence[])
	 */
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#afterClickOn(org.openqa.selenium.WebElement, org.openqa.selenium.WebDriver)
	 */
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#afterFindBy(org.openqa.selenium.By, org.openqa.selenium.WebElement, org.openqa.selenium.WebDriver)
	 */
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#afterGetScreenshotAs(org.openqa.selenium.OutputType, java.lang.Object)
	 */
	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#afterGetText(org.openqa.selenium.WebElement, org.openqa.selenium.WebDriver, java.lang.String)
	 */
	public void afterGetText(WebElement arg0, WebDriver arg1, String arg2) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#afterNavigateBack(org.openqa.selenium.WebDriver)
	 */
	public void afterNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#afterNavigateForward(org.openqa.selenium.WebDriver)
	 */
	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#afterNavigateRefresh(org.openqa.selenium.WebDriver)
	 */
	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#afterNavigateTo(java.lang.String, org.openqa.selenium.WebDriver)
	 */
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#afterScript(java.lang.String, org.openqa.selenium.WebDriver)
	 */
	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#afterSwitchToWindow(java.lang.String, org.openqa.selenium.WebDriver)
	 */
	public void afterSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#beforeAlertAccept(org.openqa.selenium.WebDriver)
	 */
	public void beforeAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#beforeAlertDismiss(org.openqa.selenium.WebDriver)
	 */
	public void beforeAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#beforeChangeValueOf(org.openqa.selenium.WebElement, org.openqa.selenium.WebDriver, java.lang.CharSequence[])
	 */
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#beforeClickOn(org.openqa.selenium.WebElement, org.openqa.selenium.WebDriver)
	 */
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#beforeFindBy(org.openqa.selenium.By, org.openqa.selenium.WebElement, org.openqa.selenium.WebDriver)
	 */
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#beforeGetScreenshotAs(org.openqa.selenium.OutputType)
	 */
	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#beforeGetText(org.openqa.selenium.WebElement, org.openqa.selenium.WebDriver)
	 */
	public void beforeGetText(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#beforeNavigateBack(org.openqa.selenium.WebDriver)
	 */
	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#beforeNavigateForward(org.openqa.selenium.WebDriver)
	 */
	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#beforeNavigateRefresh(org.openqa.selenium.WebDriver)
	 */
	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#beforeNavigateTo(java.lang.String, org.openqa.selenium.WebDriver)
	 */
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#beforeScript(java.lang.String, org.openqa.selenium.WebDriver)
	 */
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#beforeSwitchToWindow(java.lang.String, org.openqa.selenium.WebDriver)
	 */
	public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.openqa.selenium.support.events.WebDriverEventListener#onException(java.lang.Throwable, org.openqa.selenium.WebDriver)
	 */
	public void onException(Throwable error, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Exception occured: " + error);
		try {
			TestUtil.takeScreenshotAtEndOfTest();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
