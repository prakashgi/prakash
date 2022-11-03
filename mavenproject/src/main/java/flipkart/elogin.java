package flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class elogin {

	@FindBy (xpath="//a[text()='Login']")
	private WebElement eloginvar;
	
	
	
	public elogin (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void elogin1() {
		eloginvar.click();
	}
	
	
	
	
	
}
