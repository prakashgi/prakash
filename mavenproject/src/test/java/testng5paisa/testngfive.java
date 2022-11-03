 package testng5paisa;

 import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fivepaisa.clickhere;
import fivepaisa.home;
import fivepaisa.homelogin;
import fivepaisa.login;
import fivepaisa.logout;

public class testngfive {

	WebDriver driver;
	homelogin a;
	login b;
	home c;
	logout d;
	clickhere x;
	
	@Parameters("browser")
	
	@BeforeTest
	public void beforetest(String browserName) {
		System.out.println(browserName);
		if(browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			ChromeOptions opt = new ChromeOptions();

			opt.addArguments("--disable-notifications");
			  driver = new ChromeDriver(opt);	
		}
		if(browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\gicodriver\\geckodriver.exe");
			FirefoxOptions options = new FirefoxOptions();
		     options.addPreference("dom.webnotifications.enabled", false);
			driver = new FirefoxDriver(options);


		}
		driver.get("https://www.5paisa.com/home-new?_s_cid=5104&_s_vid=6216");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
				
		
	}
	
	
	@BeforeClass
	public void browseropen() {
	//System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	//ChromeOptions opt = new ChromeOptions();
	//opt.addArguments("--disable-notifications");
	//driver=new ChromeDriver(opt);
		a=new homelogin(driver);
	    b =new login(driver);
		 c=new home(driver);
		 d=new logout(driver);
		
		
		clickhere x=new clickhere(driver);
		 a.elogin();
		    
		    Set<String> child = driver.getWindowHandles();
		    ArrayList<String> childa=new ArrayList<String>(child);
		    String e = childa.get(1);
		  
		    driver.close();  
		    
		    driver.switchTo().window(e);
		 
	}
	@BeforeMethod
	public void urllaunch() throws InterruptedException {
		//driver.get("https://www.5paisa.com/home-new?_s_cid=5104&_s_vid=6216");
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		
		// a=new homelogin(driver);
		 //b =new login(driver);
		 //c=new home(driver);
		 //d=new logout(driver); 
		 
		
		// clickhere x=new clickhere(driver);
		 //a.elogin();
		    
		   // Set<String> child = driver.getWindowHandles();
		    //ArrayList<String> childa=new ArrayList<String>(child);
		    //String e = childa.get(1);
		  
		    //driver.close();  
		    
		    //driver.switchTo().window(e);
		    x.oldpage();
		    Thread.sleep(2000);
		    b.username();
		    b.password();
		    b.dateob();
		    b.submit();
	Thread.sleep(2000);	    
	}
	@Test 
	public void test1()  {
    c.watchlist();
    
    
    
	}
	@Test 
    public void test2()    {
  
		c.order();
    
	}
	
	
 @AfterMethod
 public void aftermethod()  {
	
	d.profile();

	d.logoutbutton();
   
 }
 @AfterClass
 public void afterclass()  {
	
 	a=null;
 	b=null;
 	c=null;
 	d=null;
 	x=null;
 	driver=null;
 }
 
 @AfterTest
 public void aftertest() {
	 driver.close();
	 System.gc();
 }
 }
