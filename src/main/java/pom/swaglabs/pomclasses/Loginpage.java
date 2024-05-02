package pom.swaglabs.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	//declaration
		@FindBy(xpath="//input[@id='user-name']")private WebElement untxt;
		@FindBy(xpath="//input[@name='password']")private WebElement pswtxt;
		@FindBy(xpath="//input[@name='login-button']")private WebElement loginbtn;
		//initialization
		public Loginpage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);	
		}
		//getters
		
		public WebElement getUntxt() {
			return untxt;
		}
		public WebElement getPswtxt() {
			return pswtxt;
		}
		public WebElement getLoginbtn() {
			return loginbtn;
		}
	//Business Library
		public void LoginToApp(String Un,String psw) {
			untxt.sendKeys(Un);
			pswtxt.sendKeys(psw);
			loginbtn.click();
		}
		}


