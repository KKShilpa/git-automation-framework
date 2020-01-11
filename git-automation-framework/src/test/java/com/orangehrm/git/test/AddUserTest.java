package com.orangehrm.git.test;

import org.testng.annotations.Test;

import com.orangehrm.git.pages.GitLoginPage;

public class AddUserTest {

	@Test(groups ="assignment", enabled = true)
	public void addAdminUserTest()
	{
		GitLoginPage lp = new GitLoginPage();
			
		lp.enterValidLoginDetails("Admin", "Admin123")
			.verifyWelcomeTextHomePage("Welcome Admin")
				.clickOnAdminMenue()
					.clickOnAddUserBtn()
						.selectUserRoll("Admin")
						.enterEmpName("Shilpa Rahul Kamble")
							.enterUserName("KKShilpa")  
								.enterPassword("KK@shilpa")
									.enterConfirmPassword("KK@shilpa")
										.clickSave();		
			}

	@Test(groups ="assignment", enabled = true)
	public void addESSUser()
	{
		GitLoginPage lp = new GitLoginPage();
		lp.enterValidLoginDetails("Admin", "Admin123")
			.verifyWelcomeTextHomePage("Welcome Admin")
				.clickOnAdminMenue()
					.clickOnAddUserBtn()
						.selectUserRoll("ESS")
							.enterEmpName("Shilpa Rahul Kamble")
							.enterUserName("Shilpakk")
								.enterPassword("Shilpa@kk")
									.enterConfirmPassword("Shilpa@kk");
									
		}
	
	@Test(groups ="assignment", enabled = true)
	public void addUserWithDuplicateUserName()
	{
		GitLoginPage lp = new GitLoginPage();
		lp.enterValidLoginDetails("Admin","Admin123")
			.verifyWelcomeTextHomePage("Welcome Admin")
			.clickOnAdminMenue()
				.clickOnAddUserBtn()
					.selectUserRoll("Admin")
						.enterEmpName("Shilpa Rahul Kamble")
							.enterUserName("Shilpa")
								.enterPassword("KK@Shilpa")
									.enterConfirmPassword("KK@Shilpa")
										.clickSave()
											.verifyDuplicateUserNameError("Already exists");
		}
	
	@Test(groups ="assignment", enabled = true)
	public void verifySearchedUserToEdit()
	{
		GitLoginPage lp = new GitLoginPage();
		lp.enterValidLoginDetails("Admin","Admin123")
		.verifyWelcomeTextHomePage("Welcome Admin")
			.clickOnAdminMenue()
				.clickOnAddUserBtn()
					.enterUserNameForSearch("Shilpa")
						.clickSearchBtn()
							.clickOnSearchedUser()
								.clickOnEditandSaveBtn();
								
	}
	
	@Test(groups ="assignment", enabled = true)
	public void verifyDeleteAddedUser()
	{
		GitLoginPage lp = new GitLoginPage();
		
		lp.enterValidLoginDetails("Admin","Admin123")
		
			.verifyWelcomeTextHomePage("Welcome Admin")
				.clickOnAdminMenue()
					.clickOnAddUserBtn()
						.selectUserRoll("Admin")
						.enterEmpName("Shilpa Rahul Kamble")
							.enterUserName("ABCDEFG")
								.enterPassword("KK@shilpa")
									.enterConfirmPassword("KK@shilpa")
										.clickSave()
											.enterUserNameForSearch("ABCDEFG")
												.clickSearchBtn()
													.clickSearchedUserCheckBox()
														.clickDeleteBtn()
															.verifyConfirmationPopUp();
												
											
		
	}
	

}
