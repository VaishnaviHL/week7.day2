package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {

	@FindBy(how = How.ID, using = "updateLeadForm_companyName")
	private WebElement elementeditCName;
	@FindBy(how = How.NAME, using = "submitButton")
	private WebElement elementclickUpdate;

	public EditLeadPage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;
		PageFactory.initElements(driver, this);

	}

	public EditLeadPage editCompanyname() {
		elementeditCName.sendKeys("HVL");
		return this;
	}

	public VerifyLeadPage clickUpdate() {
		elementclickUpdate.click();
		return new VerifyLeadPage(driver);

	}
}
