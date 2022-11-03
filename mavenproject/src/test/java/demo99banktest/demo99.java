package demo99banktest;

//import static org.testng.Assert.assertEquals;
//import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
//import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import guru99bank.home;
import guru99bank.login;
import utility.Utility;

public class demo99 {
	
 WebDriver driver;	
 login login;
 home home;
 int testid;
	
	@Parameters("browser")
	@BeforeTest
	public void browserlaunch(String browser) {
		System.out.println(browser);
		if(browser.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			//ChromeOptions opt = new ChromeOptions();

			//opt.addArguments("--disable-notifications");
			driver = new ChromeDriver();	
		}
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\gicodriver\\geckodriver.exe");
			//WebDriver driver = new FirefoxDriver();

			//FirefoxOptions options = new FirefoxOptions();
		    //options.addPreference("dom.webnotifications.enabled", false);
			driver = new FirefoxDriver();
	}
		driver.get("https://www.demo.guru99.com/V4/");  ////a[@id='SwitchToLWPLoginUrl']
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize(); 
	 
	}
	
	@BeforeClass
	public void beforeclass() {
		 login=new login(driver);
		 home=new home(driver);
	}
	
	@BeforeMethod
	public void beforemethod() {
		
		try {
			login.username();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		login.password();
		login.submitbut();
		
	}
	
	@Test
	
	public void test() throws InterruptedException {
		testid=123;
		
		home.newcustomer();
		home.custmoername();
		home.radio();
		
		home.date();
		
		home.address();
		home.citym();
		home.state();
		home.pincode();
		home.mobile();
		home.email();
		home.password();
		home.submit();
		String url = driver.getCurrentUrl();
		//boolean a = url.contains("abc");
	    Assert.assertEquals(url,"https://demo.guru99.com/V1/html/Ed.php");//https://demo.guru99.com/V1/html/EditCustomer.php
	  //   Assert.assertTrue(a);
  	
	} 
	
	@AfterMethod
	public void aftermethod(ITestResult result) throws InterruptedException, IOException {
		if( ITestResult .FAILURE==result.getStatus()) {
	
			Utility.capturescreenshot(driver,testid);
	
			
		}
		home.logouth();}
	
	
	@AfterClass()
	public void afterclass(){
		login=null;
		home=null;
	}
	
	@AfterTest
	public void aftertest(){
		System.gc();
		driver.quit();
		
	}
	
	
	
	

	}
