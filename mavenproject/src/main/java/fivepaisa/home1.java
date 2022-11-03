package fivepaisa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home1 {
   @FindBy (xpath="//span[text()='Watchlist']")   //
   private WebElement  watchvar;
   
   @FindBy (xpath="//span[text()='Order & position']")
   private WebElement  ordervar;
   

   @FindBy (xpath="//button[@id='dropdownMenuButton']")
   private WebElement  profilevar;

   @FindBy (xpath="//a[text()='Logout']")////a[text()='Logout']
   private WebElement  logoutvar;
   
public home1(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void watchlist() {
	watchvar.click();
}
public void order() {
	ordervar.click();
}
public void profile() {
	profilevar.click();
}
public void logout() {
	logoutvar.click();
}
}
