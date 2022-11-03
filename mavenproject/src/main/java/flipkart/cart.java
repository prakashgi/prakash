package flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cart {
@FindBy (xpath="(//div[text()='Remove'])[1]")
private WebElement removevar;  //

@FindBy (xpath="//div[@class='_3dsJAO _24d-qY FhkMJZ']")
private WebElement removew;  

//@FindBy (xpath="//div[text()='Logout']")
//private WebElement logout;  

public  cart(WebDriver driver) {
	PageFactory.initElements(driver,this);
}


public void remove() {
	
	removevar.click();
}
public void removewindow() {
	removew.click();
}

//public void logout() {
	//logout.click();
//}









}
