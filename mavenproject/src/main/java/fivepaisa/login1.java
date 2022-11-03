package fivepaisa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login1 {
	
	@FindBy(xpath="(//input[@name='login.UserName'])[1]")
    private WebElement un;
	@FindBy(xpath="//input[@id='loginPwd']")
    private WebElement pw;
	@FindBy(xpath="//input[@id='loginDob']")
    private WebElement dob;
	@FindBy(xpath="(//input[@value='Login'])[1]")
    private WebElement sub;
	
	public login1(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	public void username() {
		un.sendKeys("8668995237");
	}
	public void password() {
		pw.sendKeys("abhi.7oct");
	}
	public void dateofb() {
		dob.sendKeys("07101989");
	}
	public void submit() {
		sub.click();
	}
	

}
