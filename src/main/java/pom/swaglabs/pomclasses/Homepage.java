package pom.swaglabs.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	//declaration
	@FindBy(xpath="//div[@class='inventory_item_name']")private WebElement backpacktxt;
	@FindBy(xpath="//div[@class='inventory_item_name']")private WebElement lighttxt;
	@FindBy(xpath="//div[@class='inventory_item_name']")private WebElement tshirttxt;
	@FindBy(xpath="//div[@class='inventory_item_name']")private WebElement jackettxt;
	@FindBy(xpath="//div[@class='inventory_item_name']")private WebElement onesietxt;
	@FindBy(xpath="//div[@class='inventory_item_name']")private WebElement redshirttxt;
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);	
	}
	public WebElement getBackpacktxt() {
		return backpacktxt;
	}
	public WebElement getLighttxt() {
		return lighttxt;
	}
	public WebElement getTshirttxt() {
		return tshirttxt;
	}
	public WebElement getJackettxt() {
		return jackettxt;
	}
	public WebElement getOnesietxt() {
		return onesietxt;
	}
	public WebElement getRedshirttxt() {
		return redshirttxt;
	}


}
