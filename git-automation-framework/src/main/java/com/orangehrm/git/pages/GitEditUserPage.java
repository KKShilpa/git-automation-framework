package com.orangehrm.git.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangehram.git.common.GitSeleniumWebDriverFactory;

public class GitEditUserPage {

	
	public GitEditUserPage()
	{
		PageFactory.initElements(GitSeleniumWebDriverFactory.getDriver(),this);
	}

	/*public GitEditUserPage isEditUserPageLoaded()
	{
		wait.until(ExpectedConditions.elementToBeClickable(element))
		return this;
	}*/
}
