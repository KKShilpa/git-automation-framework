package com.orangehrm.git.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehram.git.common.GitSeleniumWebDriverFactory;

public class GitHomePage {

	public GitHomePage()
	{
		PageFactory.initElements(GitSeleniumWebDriverFactory.getDriver(),this);
	}

	@FindBy(id = "menu_admin_viewAdminModule" )
	WebElement adminTab;

	public GitAdminPage clickOnAdminMenue()
	{
		adminTab.click();
		return new GitAdminPage();
	}

}
