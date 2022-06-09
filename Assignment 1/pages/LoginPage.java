package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	public LoginPage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;
	}

	public LoginPage enterUsername(String username) {
		driver.findElement(By.id(property.getProperty("loginPage.username.id"))).sendKeys(username);
		return this;
	}

	public LoginPage enterPassword(String password) {
		driver.findElement(By.id(property.getProperty("loginPage.password.id"))).sendKeys(password);
		return this;

	}

	public WelcomePage clickLogin() {
		driver.findElement(By.className(property.getProperty("loginPage.Login.class"))).click();
		return new WelcomePage(driver);

	}
}
