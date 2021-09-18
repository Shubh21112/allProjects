package pomclasses;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class myprofile {
	    private	WebDriver driver;
		@FindBy (xpath = "(//span//img[@crossorigin='anonymous'])[1]")
		private WebElement profile;
		
		@FindBy (xpath = "//div//div[text()='Log Out']")
		private WebElement logoutbutton;
		
		//div//div[text()='Log Out']
		
		public myprofile (WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
		}
		public void logout()
		{
			logoutbutton.click();
		}
		public void myprofile()
		{
			profile.click();
		}
		
		
		//div//span//img[@alt='mr.bodkhe_1211's profile picture']
	}


