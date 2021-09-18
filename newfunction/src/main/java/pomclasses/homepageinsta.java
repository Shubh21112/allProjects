package pomclasses;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class homepageinsta {
		private WebDriver driver;
		
		@FindBy (xpath = "//div//button[text()='Not Now']")
		private WebElement saveinfo ;
		//button[text()='Not Now']
		@FindBy (xpath = "//div//button[text()='Not Now']")
		private WebElement notification ;
		
		@FindBy (xpath = "(//div[@id='react-root']//nav//div//div)[14]//a")
		private WebElement dms ;
		
		
		
		//*[@id="react-root"]/div/div/section/nav/div[2]/div/div/div[3]/div/div[2]/a/svg
	//	
		
//		@FindBy (xpath = "//input[@name='password']")
//		private WebElement password ;
	//	
//		@FindBy (xpath = "//button//div[text()='Log In']")
//		private WebElement loginbutton;
		
		public homepageinsta (WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
		}
		public void dmbutton()
		{
			dms.click();
		}
		public void dontsave()
		{
			saveinfo.click();
		}
		
		public void notificationoff()
		{
			notification.click();
		}
		
		//div//button[text()='Not Now']

	}



