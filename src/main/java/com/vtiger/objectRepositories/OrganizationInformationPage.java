package com.vtiger.objectRepositories;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericutilities.WebDriverUtility;

	//import com.vtiger.genericUtilities.WebDriverUtility;

	public class OrganizationInformationPage extends WebDriverUtility {
		@FindBy(xpath = "//input[@name='accountname']")private WebElement orgNameedt;
		@FindBy(xpath="//input[@title='Save[Alt+S]']")private WebElement saveBtn;
		//initilization
		public OrganizationInformationPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		//getters
		
		public WebElement getOrgNamedt() {
			return orgNameedt;
		}
		public WebElement getSaveBtn() {
			return saveBtn;
		}
		//Business library
		public void cretaeNewOrganization(String ORGNAME)
		{
		orgNameedt.sendKeys(ORGNAME);
		saveBtn.click();
		}
		
		public String getHeader() {
			return orgNameedt.getText();
			
			
		}
		
		}


