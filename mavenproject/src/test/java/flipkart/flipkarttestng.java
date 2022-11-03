package flipkart;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class flipkarttestng {
    
	WebDriver driver;
	elogin elogin;
	loginpopup loginpopup;
	home home;
	homepopup homepopup;
	cart cart;
	
	
	
	@BeforeClass 
	public void beforeclass() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
			}
	
	@BeforeMethod 
	public void beforemethod() {
		driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	     elogin=new elogin(driver);
	     loginpopup=new loginpopup(driver);
	     home =new home(driver);
	     homepopup=new homepopup(driver);
	     cart =new cart(driver);
	     
        //  elogin.elogin1();
          loginpopup.username();
          loginpopup.password();
          loginpopup.submit();
          
	}
	
	
	@Test
	public void test () throws InterruptedException {
		Thread.sleep(2000);
		home.searchproduct();
		
		home.productclick();
		Set<String> cb = driver.getWindowHandles();
		ArrayList<String> cba=new ArrayList<String>(cb);
		String cbh = cba.get(1);
		driver.close();
		driver.switchTo().window(cbh);
		homepopup.addcart();
		cart.remove();
		Thread.sleep(3000);
		cart.removewindow();
		
		
		
	}

	@AfterMethod
	public void aftermethod () throws InterruptedException {
		
	WebElement src = driver.findElement(By.xpath("//div[@class='_1psGvi _3BvnxG']"));
	Actions act=new Actions(driver);
	act.moveToElement(src).build().perform();
	
	WebElement des = driver.findElement(By.xpath("//div[text()='Logout']")); 
	act.moveToElement(des).click().build().perform();
	}

	@AfterClass
	public void afterclass () {
		driver.close();
	}
    }
