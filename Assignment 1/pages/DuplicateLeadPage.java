package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class DuplicateLeadPage extends ProjectSpecificMethods {
	public DuplicateLeadPage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;
	}

	public VerifyLeadPage clickCreateLeadinDuplicate() {
		driver.findElement(By.name(property.getProperty("duplicateLeadPage.createLead.name"))).click();
		return new VerifyLeadPage(driver);

	}
}
