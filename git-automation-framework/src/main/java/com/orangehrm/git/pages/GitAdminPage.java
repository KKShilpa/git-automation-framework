package com.orangehrm.git.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GitAdminPage {

	@FindBy(id = "btnAdd")
	WebElement addUserBtn;

	@FindBy(id = "menu_admin_UserManagement")
	WebElement userManagementTab;
	
	public GitAddUserPage clickOnAddUserBtn() {
		userManagementTab.click();
		addUserBtn.click();
		return new GitAddUserPage();
	}

}
