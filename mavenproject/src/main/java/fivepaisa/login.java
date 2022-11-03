package fivepaisa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	
	@FindBy(xpath="(//input[@name='login.UserName'])[1]")
	private WebElement un;
	
	@FindBy(xpath="//input[@id='loginPwd']")
	private WebElement pwd;
	@FindBy (xpath="//input[@id='loginDob']") private WebElement logdob;

	@FindBy(xpath="(//input[@value='Login'])[1]")
	private WebElement loginbutton;
		
	public login (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void username() {
		un.sendKeys("8668995237");
	}
   public void password() 
       {
	   pwd.sendKeys("abhi.7oct");
	   }
	   
	   public void dateob() {
		   logdob.sendKeys("07101989");
	   }
	   public void submit() 
	   {
		   loginbutton.click();
	   }
   }

