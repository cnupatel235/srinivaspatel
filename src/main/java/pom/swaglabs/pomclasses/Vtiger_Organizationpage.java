package pom.swaglabs.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vtiger_Organizationpage {
	@FindBy(xpath="//[.a='Organizations']")private WebElement orgmod ;
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement orgcreatenewbtn;
	@FindBy(xpath="//input[@name='accountname']")private WebElement orgnametxt ;
	@FindBy(xpath="//input[@class='crmbutton small save']")private WebElement savebtn ;
	public Vtiger_Organizationpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getOrgmod() {
		return orgmod;
	}
	public WebElement getOrgcreatenewbtn() {
		return orgcreatenewbtn;
	}
	public WebElement getOrgnametxt() {
		return orgnametxt;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
//business library
	public void clickonorgmod() {
		orgmod.click();
	}
	public void clickonorgcreatenewbtn() {
		orgcreatenewbtn.click();
	}
	public void clickonorgnametxt() {
		orgnametxt.click();
	}
	public void clickonsavebtn() {
		savebtn.click();
	}
}
