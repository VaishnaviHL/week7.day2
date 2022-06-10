package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	@FindBy(how = How.ID, using = "createLeadForm_companyName")
	private WebElement elementCName;
	@FindBy(how = How.ID, using = "createLeadForm_firstName")
	private WebElement elementFName;
	@FindBy(how = How.ID, using = "createLeadForm_lastName")
	private WebElement elementLName;
	@FindBy(how = How.NAME, using = "submitButton")
	private WebElement elementCreateLead;

	public CreateLeadPage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;
		PageFactory.initElements(driver, this);
	}

	public CreateLeadPage enterCompanyname(String cname) {
		elementCName.sendKeys(cname);
		return this;
	}

	public CreateLeadPage enterFirstName(String fname) {
		elementFName.sendKeys(fname);
		return this;

	}

	public CreateLeadPage enterLastName(String lname) {
		elementLName.sendKeys(lname);
		return this;
	}

	public VerifyLeadPage clickCreateLeadbutton() {
		elementCreateLead.click();
		return new VerifyLeadPage(driver);

	}
}
