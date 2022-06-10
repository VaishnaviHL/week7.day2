package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class FindLeadPage extends ProjectSpecificMethods {
	@FindBy(how = How.XPATH, using = "//span[text()='Phone']")
	private WebElement elementclickPhone;
	@FindBy(how = How.XPATH, using = "//input[@name='phoneNumber']")
	private WebElement elemententerPhoneNo;
	@FindBy(how = How.XPATH, using = "//button[text()='Find Leads']")
	private WebElement elementclickFindLeads;
	@FindBy(how = How.XPATH, using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement elementclickLeadID;

	public FindLeadPage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;
		PageFactory.initElements(driver, this);

	}

	public FindLeadPage clickPhone() {
		elementclickPhone.click();
		return this;
	}

	public FindLeadPage enterPhoneNum(String phoneNumber) {
		elemententerPhoneNo.sendKeys(phoneNumber);
		return this;

	}

	public FindLeadPage clickFindLeads() throws InterruptedException {
		elementclickFindLeads.click();
		Thread.sleep(2000);
		return this;
	}

	public VerifyLeadPage clickLeadID() {
		elementclickLeadID.click();
		return new VerifyLeadPage(driver);

	}
}
