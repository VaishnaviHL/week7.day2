package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {
	public EditLeadPage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;
	}

	public EditLeadPage editCompanyname() {
		driver.findElement(By.id(property.getProperty("editLeadPage.updateCompanyName.id"))).sendKeys("HVL");
		return this;
	}

	public VerifyLeadPage clickUpdate() {
		driver.findElement(By.name(property.getProperty("editLeadPage.clickUpdate.name"))).click();
		return new VerifyLeadPage(driver);
	}
}
