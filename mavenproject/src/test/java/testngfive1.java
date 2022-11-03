    

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fivepaisa.clickhere;
import fivepaisa.home1;
import fivepaisa.homelogin1;
import fivepaisa.login1;
import utility.Utility;

public class testngfive1 {
	int testid;
	WebDriver driver;
	homelogin1 hlogin;
	login1 login;
	home1 main;
	
	@BeforeClass
	public void beforeclass1() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		}
	
	@BeforeMethod
	public void beforemethod1() throws InterruptedException {
	driver.get("https://www.5paisa.com/home-new?_s_cid=5104&_s_vid=6216");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	homelogin1 hlogin=new homelogin1(driver);
	login1 login=new login1(driver);
	home1 main= new home1(driver);
	 
	hlogin.elogin();
	       Set<String> cb = driver.getWindowHandles();
	ArrayList<String> cba=new ArrayList<String>(cb);
    String cbaw = cba.get(1);
    Thread.sleep(2000);
    driver.close();	
    driver.switchTo().window(cbaw);
	clickhere s=new clickhere(driver);
     s.oldpage();
    login.username();
    login.password();
    login.dateofb();
    login.submit();
 
	}
	
	@Test
	public void test() throws InterruptedException {
		 testid=134;
		Thread.sleep(2000);
		main.watchlist();

	}

  @Test
	public void test2() {
	   testid=1234;
	main.order();	
	
	}
	@AfterMethod
	public void aftermethod1(ITestResult result) throws IOException {
		if(ITestResult.FAILURE==result.getStatus()) {
		Utility.capturescreenshot(driver, testid);
			main.profile();		
		main.logout();
	}}
	@AfterClass
	public void afterclass() {
		driver.close();
	}
	
}
