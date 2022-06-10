package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class VerifyLeadPage extends ProjectSpecificMethods {
	@FindBy(how = How.ID, using = "viewLead_companyName_sp")
	private WebElement elementVerifyLeadID;
	@FindBy(how = How.LINK_TEXT, using = "Edit")
	private WebElement elementclickEditButton;
	@FindBy(how = How.LINK_TEXT, using = "Duplicate Lead")
	private WebElement elementclickDuplicateButton;
	@FindBy(how = How.LINK_TEXT, using = "Delete")
	private WebElement elementclickDeleteButton;

	public VerifyLeadPage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;
		PageFactory.initElements(driver, this);

	}

	public VerifyLeadPage verifyLeadID() {
		String leadID = elementVerifyLeadID.getText().replaceAll("[^0-9]", "");
		System.out.println("The lead ID is: " + leadID);
		return this;
	}

	public EditLeadPage clickEditButton() {
		elementclickEditButton.click();
		return new EditLeadPage(driver);
	}

	public DuplicateLeadPage clickDuplicateButton() {
		elementclickDuplicateButton.click();
		return new DuplicateLeadPage(driver);
	}

	public VerifyLeadPage clickDeleteButton() {
		elementclickDeleteButton.click();
		return this;
	}

}
