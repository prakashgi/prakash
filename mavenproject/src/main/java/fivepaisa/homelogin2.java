package fivepaisa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homelogin2 {

	@FindBy(xpath = "//a[text()='Login']")
	 private WebElement homelogin;
	
	//initialise variables 
	
	public homelogin2(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	// create method
	
	public void Homelogin() {
		homelogin.click();
	}
	    
}