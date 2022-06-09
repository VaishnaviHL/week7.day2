package com.leaftaps.ui.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class MergeLeadPage extends ProjectSpecificMethods {
	Set<String> allWindows;
	List<String> allhandles;
	Set<String> allWindows2;
	List<String> allhandles2;

	public MergeLeadPage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;
	}

	public MergeLeadPage clickFromLeadLookup() {
		driver.findElement(By.xpath(property.getProperty("mergeLeadsPage.fromLeadLookup.xpath"))).click();
		allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		return this;
	}

	public MergeLeadPage enterFirstNameinFromLeadLookup(String fname) {
		driver.findElement(By.xpath(property.getProperty("mergeLeadsPage.enterfnamefromLeadLookup.xpath")))
				.sendKeys(fname);
		return this;
	}

	public MergeLeadPage clickFindLeadsinFromLead() throws InterruptedException {
		driver.findElement(By.xpath(property.getProperty("mergeLeadsPage.clickFindleadsfromLeadLookup.xpath"))).click();
		Thread.sleep(2000);
		return this;
	}

	public MergeLeadPage clickLeadIDinFromLead() {
		driver.findElement(By.xpath(property.getProperty("mergeLeadsPage.clickLeadIDfromLeadLookup.xpath"))).click();
		driver.switchTo().window(allhandles.get(0));
		return this;

	}

	public MergeLeadPage clickToLeadLookup() {
		driver.findElement(By.xpath(property.getProperty("mergeLeadsPage.toLeadLookup.xpath"))).click();
		allWindows2 = driver.getWindowHandles();
		allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		return this;
	}

	public MergeLeadPage enterFirstNameinToLeadLookup() {
		driver.findElement(By.xpath(property.getProperty("mergeLeadsPage.enterfnameToLeadLookup.xpath")))
				.sendKeys("babu");
		return this;
	}

	public MergeLeadPage clickFindLeadsinToLead() throws InterruptedException {
		driver.findElement(By.xpath(property.getProperty("mergeLeadsPage.clickFindleadsToLeadLookup.xpath"))).click();
		Thread.sleep(1000);
		return this;
	}

	public MergeLeadPage clickLeadIDinToLead() {
		driver.findElement(By.xpath(property.getProperty("mergeLeadsPage.clickLeadIDToLeadLookup.xpath"))).click();
		driver.switchTo().window(allhandles2.get(0));
		return this;
	}

	public VerifyLeadPage clickMergeButton() {
		driver.findElement(By.xpath(property.getProperty("mergeLeadsPage.clickMergeButton.xpath"))).click();
		driver.switchTo().alert().accept();
		return new VerifyLeadPage(driver);
	}

}
