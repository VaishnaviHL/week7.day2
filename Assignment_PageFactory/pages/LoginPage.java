package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	@FindBy(how = How.ID, using = "username")
	private WebElement elementUsername;
	@FindBy(how = How.ID, using = "password")
	private WebElement elementPassword;
	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit")
	private WebElement elementClickLogin;

	public LoginPage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;
		PageFactory.initElements(driver, this);
	}

	public LoginPage enterUsername(String username) {
		elementUsername.sendKeys(username);
		return this;
	}

	public LoginPage enterPassword(String password) {
		elementPassword.sendKeys(password);
		return this;

	}

	public WelcomePage clickLogin() {
		elementClickLogin.click();
		return new WelcomePage(driver);

	}
}
