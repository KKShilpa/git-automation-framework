package com.orangehrm.git.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangehram.git.common.GitSeleniumWebDriverFactory;

public class GitHomePage {


	@FindBy(id = "menu_admin_viewAdminModule" )
	WebElement adminTab;
	
	WebDriverWait wait = new WebDriverWait(GitSeleniumWebDriverFactory.getDriver(),30);

	public GitHomePage()
	{
		PageFactory.initElements(GitSeleniumWebDriverFactory.getDriver(),this);
	}
	
	public GitAdminPage clickOnAdminMenue()
	{
		adminTab.click();
		return new GitAdminPage();
	}

	public GitHomePage isHomePageLoaded()
	{
		wait.until(ExpectedConditions.elementToBeClickable(adminTab));
		return this;
	}
}
