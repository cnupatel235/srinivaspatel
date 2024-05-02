package com.vtiger.objectRepositories;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericutilities.WebDriverUtility;

//import com.vtiger.genericUtilities.WebDriverUtility;
public class CreatenewOrganization extends WebDriverUtility {
//Declaration
	@FindBy(xpath="//input[@name='accountname']")private WebElement orgNameedt;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")private WebElement saveBtn;
//Initailization
	public CreatenewOrganization(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
//Getters
	public WebElement getOrgNameedt() {
		return orgNameedt;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public void createNewOrganization(String ORGNAME) {
		orgNameedt.sendKeys(ORGNAME);
		saveBtn.click();
	}
}
