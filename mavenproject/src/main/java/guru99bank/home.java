    package guru99bank;

    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.PageFactory;

    public class home {
	
	@FindBy (xpath="//a[text()='New Customer']")
	private WebElement newcus;
	
	@FindBy (xpath="//input[@onblur='validatecustomername();']")
	private WebElement cusname;
	
	@FindBy (xpath="(//input[@type='radio'])[1]")
	private WebElement male;
	
	@FindBy (xpath="//input[@id='dob']")
	private WebElement date;
	
	@FindBy (xpath="//textarea[@rows='5']")
	private WebElement add;
	
	@FindBy (xpath="(//input[@type='text'])[2]")
	private WebElement city;
	
	@FindBy (xpath="(//input[@type='text'])[3]")
	private WebElement state;
	
	@FindBy (xpath="(//input[@type='text'])[4]")
	private WebElement pincode;
	
	@FindBy (xpath="(//input[@type='text'])[5]")	
	private WebElement mob;
	
	@FindBy (xpath="(//input[@type='text'])[6]")
	private WebElement email;
	
	@FindBy (xpath="//input[@onblur='validatepassword();']")
	private WebElement password;
	@FindBy (xpath="//input[@type='submit']")
	private WebElement submit;	
	
	@FindBy (xpath="//a[text()='Log out']")
	private WebElement logout;	
	                                            //a[text()='Log out']
     
	public home(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	} 
	public void newcustomer()  {
		newcus.click();}
    public void custmoername()	{
		cusname.sendKeys("prasad");}
	public void radio()	{male.click();}
	public void date()
	{
        date.sendKeys("02021999");}
		public void address() {
			add.sendKeys("abcdefghijklmn");}
		public void citym(){city.sendKeys("bijapur");	}
		public void state() {state.sendKeys("karnataka");}	
		public void pincode(){pincode.sendKeys("586103");}	
		public void mobile(){mob.sendKeys("9737766785");}
		public void email() {email.sendKeys("pgirisagar@gmail.com");}
		public void password(){password.sendKeys("pgirisagar@gmail.com");}
		public void submit(){submit.click();}
	   	
	public void logouth() {
		logout.click();
	}
	
	

}
