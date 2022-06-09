package com.leaftaps.ui.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import com.leaftaps.ui.pages.LoginPage;

public class EditLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		fileName = "tc002";
	}

	@Test(dataProvider = "testData")
	public void tc002(String username, String password, String phoneNumber) throws InterruptedException {

		new LoginPage(driver).enterUsername(username).enterPassword(password).clickLogin().clickCRMSFA().clickLeadslink().
		FindLeadsPage().clickPhone().enterPhoneNum(phoneNumber).clickFindLeads().clickLeadID().clickEditButton().editCompanyname().clickUpdate().verifyLeadID();
	}
}
