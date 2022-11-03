package fivepaisa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homelogin {
	
	@FindBy(xpath="//a[@id='tm-login']")
	private WebElement eloginvar;
	
	public homelogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void elogin() {
		eloginvar.click();
	}
	
	

}
