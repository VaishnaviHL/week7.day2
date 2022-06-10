package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class DuplicateLeadPage extends ProjectSpecificMethods {
	@FindBy(how = How.NAME, using = "submitButton")
	private WebElement elementClickCreateLeadinDuplicate;

	public DuplicateLeadPage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;
		PageFactory.initElements(driver, this);

	}

	public VerifyLeadPage clickCreateLeadinDuplicate() {
		elementClickCreateLeadinDuplicate.click();
		return new VerifyLeadPage(driver);

	}
}
