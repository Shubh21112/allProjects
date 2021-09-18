package pomclassAmazon;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class amazonLogout {
		WebDriver driver;
		Actions act;
		
		@FindBy (xpath = "//div//span[text()='Account & Lists']")
		private WebElement aaclist;
		
		@FindBy (xpath = "//a//span[text()='Sign Out']")
		private WebElement signout;
		
		
		
		public amazonLogout(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		public void option()
		{
			 act = new Actions(driver);
			act.moveToElement(aaclist).perform();	
		}
		public void signoutbutton()
		{
			 act = new Actions(driver);
			act.moveToElement(signout).click().build().perform();
		}
	}






