package guru99bank;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Utility;

public class login {

	@FindBy (xpath="//input[@type='text']")
	private WebElement un;
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement pw;
	
	@FindBy (xpath="//input[@type='submit']")
	private WebElement submit;
	
	public login(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	public void username() throws EncryptedDocumentException, IOException {
		
	un.sendKeys("mngr449583");
		
	//	String data = Utility.fetchdatafromexcelsheet("sheet1", 0, 0);
		//un.sendKeys(data);
		
	}
public void password() {
		
		pw.sendKeys("Ehehaha");
	}
public void submitbut() {
	
	submit.click();
}
}
