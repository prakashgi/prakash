package fivepaisa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homelogin1 {
	
	@FindBy (xpath="//a[text()='Login']")
	private WebElement loginvar;
	
	public homelogin1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
public void elogin() {
	loginvar.click();
}
	
}
