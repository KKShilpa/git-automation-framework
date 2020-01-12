package com.orangehrm.git.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangehram.git.common.GitSeleniumWebDriverFactory;


public class GitAdminPage {

	@FindBy(id = "btnAdd")
	WebElement addUserBtn;

	@FindBy(id = "menu_admin_UserManagement")
	WebElement userManagementTab;
	WebDriverWait wait = new WebDriverWait(GitSeleniumWebDriverFactory.getDriver(),30);
	
	public GitAdminPage()
	{
		PageFactory.initElements(GitSeleniumWebDriverFactory.getDriver(), this);
	}
	
	public GitAddUserPage clickOnAddUserBtn() {
		userManagementTab.click();
		addUserBtn.click();
		return new GitAddUserPage();
	}

	public GitAdminPage isAdminPageLoaded()
	{
		wait.until(ExpectedConditions.elementToBeClickable(userManagementTab));
		wait.until(ExpectedConditions.elementToBeClickable(addUserBtn));
		return this;
	}
}
