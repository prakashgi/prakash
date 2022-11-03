package fivepaisa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class clickhere {
	   @FindBy (xpath="//a[@id='SwitchToLWPLoginUrl']")   //
	   private WebElement  old;

	   public clickhere(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void oldpage() {
			old.click();
		}
		
}
