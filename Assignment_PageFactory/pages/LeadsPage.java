package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class LeadsPage extends ProjectSpecificMethods {
	@FindBy(how = How.LINK_TEXT, using = "Create Lead")
	private WebElement elementclickCreateLeads;
	@FindBy(how = How.LINK_TEXT, using = "Find Leads")
	private WebElement elementclickFindLeads;
	@FindBy(how = How.LINK_TEXT, using = "Merge Leads")
	private WebElement elementclickMergeLeads;

	public LeadsPage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;
		PageFactory.initElements(driver, this);
	}

	public CreateLeadPage clickCreateLeads() {
		elementclickCreateLeads.click();
		return new CreateLeadPage(driver);
	}

	public FindLeadPage FindLeadsPage() {
		elementclickFindLeads.click();
		return new FindLeadPage(driver);
	}

	public MergeLeadPage ClickMergeLeads() {
		elementclickMergeLeads.click();
		return new MergeLeadPage(driver);
	}
}
