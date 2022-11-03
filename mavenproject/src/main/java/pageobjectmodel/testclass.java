package pageobjectmodel;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
        driver.get("https://kite.zerodha.com/");
        driver.manage().window().maximize();
        
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
 
        pom a=new pom(driver);
         a.enterUN();
         a.enterPWD();
         a.login();
         
         
         pom1 b = new pom1(driver);
         Thread.sleep(3000); // it is rqd here to enter pin 
         b.pinkey();
         b.submit();
	
         home c = new home(driver);
        // Thread.sleep(2000);
         c.orderhome();
	}
}
