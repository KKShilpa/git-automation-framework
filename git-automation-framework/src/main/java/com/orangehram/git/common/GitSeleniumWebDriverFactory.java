package com.orangehram.git.common;

import org.openqa.selenium.WebDriver;

public class GitSeleniumWebDriverFactory 
{
	private static ThreadLocal<WebDriver> threadLocalStorage = new ThreadLocal<WebDriver>();

	protected static void setWebDriver(WebDriver dr) 
	{
		threadLocalStorage.set(dr);
	}

	public static WebDriver getDriver() {
		return threadLocalStorage.get();
	}

	
}
