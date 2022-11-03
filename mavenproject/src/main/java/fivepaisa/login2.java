package fivepaisa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login2 {
	@FindBy(xpath="(//input[@name='login.UserName'])[1]")
	  private WebElement UN;
	
	@FindBy(xpath="//input[@attr='false']") 
	 private WebElement PWD;
	
	@FindBy(xpath="(//input[@autocomplete='new-password'])[2]") 
	 private WebElement LoginDOB;
	@FindBy(xpath="(//input[@type='submit'])[1]")
	
	private WebElement submit;
	
	// initialise variable
	
	public  login2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 
	// create method
	
	public void username() {
		UN.sendKeys("8668995237");
	}
	 public void password() {
		PWD.sendKeys("abhi.7oct");
	}
	 public void LoginDob() {
		LoginDOB.sendKeys("07101989");
	}
	 public void Loginsubmit() {
		submit.click();
	}
	
	
}


