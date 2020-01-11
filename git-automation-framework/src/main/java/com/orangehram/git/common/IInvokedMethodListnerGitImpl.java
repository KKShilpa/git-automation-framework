package com.orangehram.git.common;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;


public class IInvokedMethodListnerGitImpl implements IInvokedMethodListener {

	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		System.out.println("---- In after invocation");
		GitSeleniumWebDriverFactory.getDriver().quit();
		
	}

	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
	System.setProperty("webdriver.chrome.driver", "c://selenium//chromedriver.exe");
	GitSeleniumWebDriverFactory.setWebDriver(new ChromeDriver());
	GitSeleniumWebDriverFactory.getDriver().manage().window().maximize();
	GitSeleniumWebDriverFactory.getDriver().get("http://127.0.0.1/orangehrm-3.3.1/");	
	}

}
