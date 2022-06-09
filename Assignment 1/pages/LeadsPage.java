package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class LeadsPage extends ProjectSpecificMethods {
	public LeadsPage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;
	}

	public CreateLeadPage clickCreateLeads() {
		driver.findElement(By.linkText(property.getProperty("leadsPage.createLead.linktext"))).click();
		return new CreateLeadPage(driver);
	}
	public FindLeadPage FindLeadsPage() {
		driver.findElement(By.linkText(property.getProperty("leadsPage.findLeads.linktext"))).click();
		return new FindLeadPage(driver);
	}
	public MergeLeadPage ClickMergeLeads() {
		driver.findElement(By.linkText(property.getProperty("leadsPage.mergeLeads.linktext"))).click();
		return new MergeLeadPage(driver);
	}
}
