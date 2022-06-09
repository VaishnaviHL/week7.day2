package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	public HomePage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;
	}

	public LeadsPage clickLeadslink() {
		driver.findElement(By.linkText(property.getProperty("homePage.leads.linktext"))).click();
		return new LeadsPage(driver);
	}

}
