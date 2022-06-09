package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class FindLeadPage extends ProjectSpecificMethods {
	public FindLeadPage(RemoteWebDriver inWardDriver) {
		this.driver= inWardDriver;
	}

	public FindLeadPage clickPhone() {
		driver.findElement(By.xpath(property.getProperty("findLeadsPage.clickPhone.xpath"))).click();
		return this;
	}

	public FindLeadPage enterPhoneNum(String phoneNumber) {
		driver.findElement(By.xpath(property.getProperty("findLeadsPage.enterPhoneNo.xpath"))).sendKeys(phoneNumber);
		return this;

	}

	public FindLeadPage clickFindLeads() throws InterruptedException {
		driver.findElement(By.xpath(property.getProperty("findLeadsPage.clickFindLeads.xpath"))).click();
		Thread.sleep(2000);
		return this;
	}

	public VerifyLeadPage clickLeadID() {
		driver.findElement(By.xpath(property.getProperty("findLeadsPage.clickLeadID.xpath"))).click();
		return new VerifyLeadPage(driver);

	}
}
