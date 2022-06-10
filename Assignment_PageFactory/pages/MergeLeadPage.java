package com.leaftaps.ui.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class MergeLeadPage extends ProjectSpecificMethods {
	Set<String> allWindows;
	List<String> allhandles;
	Set<String> allWindows2;
	List<String> allhandles2;
	@FindBy(how = How.XPATH, using = "//img[@alt='Lookup']")
	private WebElement elementclickFromLeadLookup;
	@FindBy(how = How.XPATH, using = "//input[@name='firstName']")
	private WebElement elemententerFirstNameinFromLeadLookup;
	@FindBy(how = How.XPATH, using = "//button[text()='Find Leads']")
	private WebElement elementclickFindLeadsinFromLead;
	@FindBy(how = How.XPATH, using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement elementclickLeadIDinFromLead;
	@FindBy(how = How.XPATH, using = "(//img[@alt='Lookup'])[2]")
	private WebElement elementclickToLeadLookup;
	@FindBy(how = How.XPATH, using = "//input[@name='firstName']")
	private WebElement elemententerFirstNameinToLeadLookup;
	@FindBy(how = How.XPATH, using = "//button[text()='Find Leads']")
	private WebElement elementclickFindLeadsinToLead;
	@FindBy(how = How.XPATH, using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement elementclickLeadIDinToLead;
	@FindBy(how = How.XPATH, using = "//a[text()='Merge']")
	private WebElement elementclickMerge;

	public MergeLeadPage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;
		PageFactory.initElements(driver, this);

	}

	public MergeLeadPage clickFromLeadLookup() {
		elementclickFromLeadLookup.click();
		allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		return this;
	}

	public MergeLeadPage enterFirstNameinFromLeadLookup(String fname) {
		elemententerFirstNameinFromLeadLookup.sendKeys(fname);
		return this;
	}

	public MergeLeadPage clickFindLeadsinFromLead() throws InterruptedException {
		elementclickFindLeadsinFromLead.click();
		Thread.sleep(2000);
		return this;
	}

	public MergeLeadPage clickLeadIDinFromLead() {
		elementclickLeadIDinFromLead.click();
		driver.switchTo().window(allhandles.get(0));
		return this;

	}

	public MergeLeadPage clickToLeadLookup() {
		elementclickToLeadLookup.click();
		allWindows2 = driver.getWindowHandles();
		allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		return this;
	}

	public MergeLeadPage enterFirstNameinToLeadLookup() {
		elemententerFirstNameinToLeadLookup.sendKeys("babu");
		return this;
	}

	public MergeLeadPage clickFindLeadsinToLead() throws InterruptedException {
		elementclickFindLeadsinToLead.click();
		Thread.sleep(1000);
		return this;
	}

	public MergeLeadPage clickLeadIDinToLead() {
		elementclickLeadIDinToLead.click();
		driver.switchTo().window(allhandles2.get(0));
		return this;
	}

	public VerifyLeadPage clickMergeButton() {
		elementclickMerge.click();
		driver.switchTo().alert().accept();
		return new VerifyLeadPage(driver);
	}

}
