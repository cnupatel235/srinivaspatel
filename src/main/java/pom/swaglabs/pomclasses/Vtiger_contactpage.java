package pom.swaglabs.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vtiger_contactpage {
	@FindBy(xpath="//[.a='Contacts']")private WebElement contact ;
	@FindBy(xpath="//imag[@src=''themes/softed/images/btnL3Add.gif']")private WebElement clickonnewbtn;
	@FindBy(xpath="//input[@name='lastname']")private WebElement enterontxt;
	@FindBy(xpath="//input[@class='crmButton small save']")private WebElement savethebtn  ;
	
	public  Vtiger_contactpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getContact() {
		return contact;
	}

	public WebElement getClickonnewmbtn() {
		return clickonnewbtn;
	}

	public WebElement getEnterontxt() {
		return enterontxt;
	}

	public WebElement getSavethebtn() {
		return savethebtn;
	}
public void clickonorgmod() {
	contact.click();
	
}
public void clickonneworgmod() {
	clickonnewbtn.click();
}
public void enteroncontxt(String srinu) {
	enterontxt.sendKeys(srinu);
}
public void clickonsvaebtn() {
	savethebtn.clear();
}

}


