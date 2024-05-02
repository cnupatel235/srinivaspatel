package pom.swaglabs.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vtigerhomepage {
	@FindBy(xpath="//[.a='Organizations']")private WebElement org ;
	@FindBy(xpath="//[.a='Contacts']")private WebElement contact ;
	@FindBy(xpath="//[.a='Opportunities']")private WebElement opp ;
	@FindBy(xpath="//input[@imag='themes/softed/images/user.PNG']")private WebElement adm ;
	@FindBy(xpath="")private WebElement signout ;
	public Vtigerhomepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getOrg() {
		return org;
	}
	public WebElement getContact() {
		return contact;
	}
	public WebElement getOpp() {
		return opp;
	}
	public WebElement getAdm() {
		return adm;
	}
	public WebElement getSignout() {
		return signout;
	}
	//business library
	public void clickonorg() {
		org.click();
	}
	public void clickcontact(){
		contact.click();
	}
	public void clickonopp() {
		opp.click();
	}
		public void clickonadm() {
			adm.click();
		}
		public void clickonsignout() {
			signout.click();
	}



}
