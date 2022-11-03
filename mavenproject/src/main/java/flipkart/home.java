package flipkart;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {
@FindBy (xpath="//input[@class='_3704LK']")                          // (xpath="(//div[contains(@class,'lrtEPN ')])[3]")
private WebElement epvar;

 @FindBy (xpath="(//div[text()='OnePlus Nord 2T 5G (Gray Shadow, 256 GB)'])[1]")  //OnePlus Nord 2T 5G (Gray Shadow, 256 GB)
 private WebElement productc;

public home(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void searchproduct() {
    epvar.sendKeys("oneplus nord 2t 5g 256 gb");    //oneplus nord 2t//oneplus nord 2t 5g 256 gb
	
	epvar.sendKeys(Keys.RETURN);
	
}
public void productclick() {
    productc.click();
}



}
