package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1 {

	@FindBy (xpath="//input[@type='password']")
	private WebElement pin;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement button;
	
	public  pom1(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
    public void pinkey() {
	pin.sendKeys("234567");
    }
    public void submit() {
    	button.click();
    }
    }
