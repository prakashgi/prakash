package fivepaisasharad;




import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fivepaisa.clickhere;
import fivepaisa.home2;
import fivepaisa.homelogin2;
import fivepaisa.login2;
import fivepaisa.logout2;





public class testngfivesharad{
	 WebDriver driver;
	 homelogin2 a;
	 login2 b;
	 home2 c;
	 logout2 d;
	 clickhere x;
	
	 @Parameters("browser")
	 @BeforeTest
	public void openbrowser1(String browser){
		System.out.println(browser);
		if(browser.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			ChromeOptions opt = new ChromeOptions();

			opt.addArguments("--disable-notifications");
			driver = new ChromeDriver(opt);	
		}
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\gicodriver\\geckodriver.exe");
			//WebDriver driver = new FirefoxDriver();

			FirefoxOptions options = new FirefoxOptions();
		    options.addPreference("dom.webnotifications.enabled", false);
			driver = new FirefoxDriver(options);
			
		}
		driver.get("https://www.5paisa.com/home-new?_s_cid=5104&_s_vid=6216");  ////a[@id='SwitchToLWPLoginUrl']
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize(); 
	 }
	
	
	
	@BeforeClass
	public void openbrowser() throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		//ChromeOptions opt = new ChromeOptions();

		//opt.addArguments("--disable-notifications");
		
		//FirefoxOptions options = new FirefoxOptions();
		//options.addPreference("dom.webnotifications.enabled", false);
		//driver = new FirefoxDriver(options);
		
	//    driver = new ChromeDriver(opt);
		 
//		 driver.manage().window().maximize();  
	
		 a =new homelogin2(driver);
		  
		 x=new clickhere(driver);
		 
	     b =new login2(driver);
	     c=new home2(driver);
	     d =new logout2(driver);
		
	
	}
	
	@BeforeMethod
	 public void openurl() throws InterruptedException {
	
	 //driver.get("https://www.5paisa.com/home-new?_s_cid=5104&_s_vid=6216");  ////a[@id='SwitchToLWPLoginUrl']
	 //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 //homelogin2 a =new homelogin2(driver);
	 //clickhere x=new clickhere(driver);
	 
	 a.Homelogin();
	
	 Set<String> child = driver.getWindowHandles();
	 ArrayList<String> child1=new ArrayList<String>(child);
	 String e= child1.get(1);
	 driver.close();
	 Thread.sleep(2000);
	 driver.switchTo().window(e);
	 
	  x.oldpage();          
     //b =new login2(driver);
     //c=new home2(driver);
     //d =new logout2(driver);
	 b.username();
	 
	 b.password();
	 Thread.sleep(2000);
	 
	 b.LoginDob();
	 b.Loginsubmit();
	 
	
	}
	
	@Test 
	public void test() 
	{
		c.watch();
		
	}	 

	@Test
	public void test1() 
	{
		//WebDriverWait f=new WebDriverWait(driver,20);
		//WebElement g=f.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Order & position']")));
		c.OrAndpo();
	
	}
	  @AfterMethod
	   public void logout() throws InterruptedException 
	  {
		  d.ABHIJEET();
		  d.Logout();
		  
	  }
	  
	 
	  
	  
	  @AfterClass
	  public void Afterclass() 
	  {
		  a=null;
		  b=null;
		  c=null;
		  d=null;
		  x=null;
		//  driver=null;
	  
	  
	  }
	  @AfterTest
	  public void aftertest() {
		  driver.close();
		  System.gc();
	  }
	
	
      }