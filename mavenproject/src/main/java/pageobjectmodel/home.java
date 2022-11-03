package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {
	@FindBy (xpath="//span[text()='Orders']")
    private WebElement order;
	
	public home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void orderhome() {
		order.click();
	}
    
    
    
    
}
