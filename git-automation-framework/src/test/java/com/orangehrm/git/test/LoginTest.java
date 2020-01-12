package com.orangehrm.git.test;

import org.testng.annotations.Test;

import com.orangehram.git.common.GitBaseClass;
import com.orangehrm.git.pages.GitLoginPage;

public class LoginTest extends GitBaseClass{
	

	@Test(enabled=false,groups ="shilpaWebTest",description = "Verify valid login details")
	public void verifyValidLoginTest()
	{
		GitLoginPage login = new GitLoginPage();
		login.isLoginPageLoaded()
				.enterValidLoginDetails("Admin", "Admin123")
					.verifyWelcomeTextHomePage("Welcome Admin")
						.isHomePageLoaded();
	}
	
	@Test(enabled=false,groups ="shilpaWebTest",description = "Verify login with invalid password for error message")
	public void verifyInValidPasswordTest()
	{
		GitLoginPage login = new GitLoginPage();
		login.enterValidLoginDetails("Admin", "Admin456")
				.verifyErrorMessage("Invalid credentials");
	}
	
	@Test(enabled=true,groups ="shilpaWebTest",description = "Verify login with invalid login name  for error message")
	public void verifyInValidLoginNameTest()
	{
		GitLoginPage login = new GitLoginPage();
		login.enterValidLoginDetails("Admin345", "Admin123")
				.verifyErrorMessage("Invalid credentials");
	}
	@Test(enabled=true,groups ="shilpaWebTest",description = "Verify login with specialcharacter in login name  for error message")
	public void verifySpecialCharInLoginName()
	{
		GitLoginPage login = new GitLoginPage();
		login.enterValidLoginDetails("Admin##@$$", "Admin123")
				.verifyErrorMessage("Invalid credentials");
	}
	
	@Test(enabled=true,groups ="shilpaWebTest",description = "Verify lenth+1 character in Login name for error message")
	public void verifyLengthOfLoginNameField()
	{
		GitLoginPage login = new GitLoginPage();
		login.enterValidLoginDetails("Admin123456789011121314151617181920", "Admin123")
				.verifyErrorMessage("Invalid credentials");
	}
	@Test(enabled=true,groups ="shilpaWebTest",description = "Verify blank login name for error message")
	public void verifyLoginWithBlankLoginName()
	{
		GitLoginPage login = new GitLoginPage();
		login.enterValidLoginDetails("", "Admin123")
				.verifyErrorMessage("Username cannot be empty");
	}
	@Test(enabled=true,groups ="shilpaWebTest",description = "Verify blank password for error message")
	public void verifyLoginWithBlankPass()
	{
		GitLoginPage login = new GitLoginPage();
		login.enterValidLoginDetails("Admin", "")
				.verifyErrorMessage("Password cannot be empty");
	}
	
	@Test(enabled=true,groups ="shilpaWebTest",description = "Verify third party logos displied on login screen")
	public void verifyThirdPartyLogosOnLoginScreen()
	{
		GitLoginPage login = new GitLoginPage();		
				login.verifyThirdPartyLogosOnScreen();
	}


}
