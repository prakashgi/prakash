package flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpopup {
	
	@FindBy (xpath="(//input[@autocomplete='off'])[2]")
    private WebElement un;
	
	@FindBy (xpath="(//input[@autocomplete='off'])[3]")
    private WebElement pw;
	
	@FindBy (xpath="(//button[@type='submit'])[2]")
    private WebElement submit ;
	
	
	public loginpopup(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	public void username() {
	un.sendKeys("9737766785");	
	}

	public void password() {
		pw.sendKeys("9737766785");
	}

	public void submit() {
		submit.click();
	}
}
