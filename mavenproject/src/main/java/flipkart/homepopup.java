package flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepopup {
	
	@FindBy (xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
    private WebElement addcartvar;
	
	public homepopup(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void addcart() {
		addcartvar.click();
	}
	
	
}
