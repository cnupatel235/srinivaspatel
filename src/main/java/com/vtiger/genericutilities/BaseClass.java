package com.vtiger.genericutilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vtiger.objectRepositories.LoginPage;

public class BaseClass {
	public PropertyFileutility pu=new PropertyFileutility();
	public ExcelFileUtility eu=new ExcelFileUtility();
	public JavaUtility ju=new JavaUtility();
	public WebDriverUtility wu=new WebDriverUtility();
	public WebDriver driver=null;
	//before suite
	@BeforeSuite
		public void Bsconfig() {
			System.out.println("...DataBase CONNECTION...");
		}

//after suite
	@AfterSuite
	public void asconfig() {
		System.out.println("...DATABASE DISCONNECTED..");
	}
	
	//before class
	@BeforeClass
	public void bcconfig() throws Throwable  {
		String BROWSER=pu.readDataFromPropertyFile("browser");
		String URL=pu.readDataFromPropertyFile("url");
		if(BROWSER.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			System.out.println("Edge driver is launched");
		}
	
	else if(BROWSER.equalsIgnoreCase("Chrome")){
		driver=new ChromeDriver();
		System.out.println("chrome driver is launched");
	}
	else
	{
		System.out.println("invalid browser insert name");
	}
   driver.get(URL);
   wu.maximizeBrowserWindow(driver);
   wu.WaitForPageload(driver);
   wu.getScreenshot(driver);
}
	//after class
	@AfterClass
    public void terDown() {
 	   driver.quit();
    }
    //before method
	@BeforeMethod
    public void bmconfig() throws IOException {
 	   String UN=pu.readDataFromPropertyFile("un");
 	   String PWD=pu.readDataFromPropertyFile("pwd");
 	   LoginPage lp=new LoginPage(driver);
 	   lp.loginToApp(UN, PWD);
 	   wu.getScreenshot(driver);
    }
    //after method
	@AfterMethod
    public void amconfig() {
 	   System.out.println("logout from app");
    }
}
    

		
