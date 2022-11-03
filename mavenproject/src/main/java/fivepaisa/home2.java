package fivepaisa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home2 {
    // variable declaration
	@FindBy(xpath="//i[@class='icon-watchlist']")
	  private WebElement watchlist;
	
	@FindBy(xpath="//span[text()='Order & position']")
	private WebElement orderAndPosition;
	
	// initialise variables 
	
	public home2(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	 
	// create method 
	
	public void watch() {
		watchlist.click();
	}
	public void OrAndpo() {
		orderAndPosition.click();
	}
}