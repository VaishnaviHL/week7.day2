package com.leaftaps.ui.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import com.leaftaps.ui.pages.LoginPage;

public class MergeLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		fileName = "tc005";
	}

	@Test(dataProvider = "testData")
	public void tc005(String username, String password, String fname) throws InterruptedException {

		new LoginPage(driver).enterUsername(username).enterPassword(password).clickLogin().clickCRMSFA().clickLeadslink().
		ClickMergeLeads().clickFromLeadLookup().enterFirstNameinFromLeadLookup(fname).clickFindLeadsinFromLead().clickLeadIDinFromLead()
		.clickToLeadLookup().enterFirstNameinToLeadLookup().clickFindLeadsinToLead().clickLeadIDinToLead().clickMergeButton().verifyLeadID();
	}
}
