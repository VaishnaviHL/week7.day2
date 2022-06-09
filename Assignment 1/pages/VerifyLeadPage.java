package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class VerifyLeadPage extends ProjectSpecificMethods {
	public VerifyLeadPage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;

	}

	public VerifyLeadPage verifyLeadID() {
		String leadID = driver.findElement(By.id(property.getProperty("viewLeadPage.verifyLeadID.id"))).getText().replaceAll("[^0-9]", "");
		System.out.println("The lead ID is: " + leadID);
		return this;
	}

	public EditLeadPage clickEditButton() {
		driver.findElement(By.linkText(property.getProperty("viewLeadPage.clickEditButton.linktext"))).click();
		return new EditLeadPage(driver);
	}

	public DuplicateLeadPage clickDuplicateButton() {
		driver.findElement(By.linkText(property.getProperty("viewLeadPage.clickDuplicateButton.linktext"))).click();
		return new DuplicateLeadPage(driver);
	}

	public VerifyLeadPage clickDeleteButton() {
		driver.findElement(By.linkText(property.getProperty("viewLeadPage.clickDeleteButton.linktext"))).click();
		return this;
	}

}
