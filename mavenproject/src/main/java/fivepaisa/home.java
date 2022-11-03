package fivepaisa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {

	@FindBy (xpath="//span[text()='Watchlist']")
	private WebElement watchlistvar;
	@FindBy (xpath="//span[text()='Order & position']")
	private WebElement ordervar;
	//@FindBy (xpath="//i[@class='icon-portfolio']")
	//private WebElement portfolio;
	//@FindBy (xpath="//span[text()='Fund Ledger']")
	//private WebElement fundled;
	//@FindBy (xpath="//i[@class='icon-report']")
	//private WebElement myreport;
	
	public home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void watchlist() {
		watchlistvar.click();
	}
	public void order() {
		ordervar.click();
	}
	
}
