package fivepaisa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout2 {
 // declare variables
	@FindBy(xpath = "//button[@id='dropdownMenuButton']")
	 private WebElement ABHI;
	
	@FindBy(xpath = "//a[text()='Logout']")
	 private WebElement logout;
	
	//initialise variables 
	
	public logout2(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	// create method
	
	public void ABHIJEET() {
		ABHI.click();
	}
	public void Logout() {
		logout.click();
	}

	}