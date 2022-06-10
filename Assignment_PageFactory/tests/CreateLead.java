package com.leaftaps.ui.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import com.leaftaps.ui.pages.LoginPage;

public class CreateLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		fileName = "tc001";
	}

	@Test(dataProvider = "testData")
	public void tc001(String username, String password, String cname, String fname, String lname) {

		new LoginPage(driver).enterUsername(username).enterPassword(password).clickLogin().clickCRMSFA().clickLeadslink()
				.clickCreateLeads().enterCompanyname(cname).enterFirstName(fname).enterLastName(lname)
				.clickCreateLeadbutton().verifyLeadID();
	}
}
