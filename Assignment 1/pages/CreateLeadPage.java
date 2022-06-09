package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	public CreateLeadPage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;
	}

	public CreateLeadPage enterCompanyname(String cname) {
		driver.findElement(By.id(property.getProperty("createLeadPage.companyName.id"))).sendKeys(cname);
		return this;
	}

	public CreateLeadPage enterFirstName(String fname) {
		driver.findElement(By.id(property.getProperty("createLeadPage.firstName.id"))).sendKeys(fname);
		return this;

	}

	public CreateLeadPage enterLastName(String lname) {
		driver.findElement(By.id(property.getProperty("createLeadPage.lastName.id"))).sendKeys(lname);
		return this;
	}

	public VerifyLeadPage clickCreateLeadbutton() {
		driver.findElement(By.name(property.getProperty("createLeadPage.createLead.name"))).click();
		return new VerifyLeadPage(driver);

	}
}
