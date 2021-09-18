package pomclassAmazon;

	


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class amazonPassword {
		private WebDriver driver;
		
		@FindBy (xpath = "//input[@id='ap_password']")
		private WebElement password ;

		@FindBy (xpath = "//input[@id='signInSubmit']")
		private WebElement signin ;
		
		public amazonPassword(WebDriver driver)
		{this.driver= driver;
			PageFactory.initElements(driver, this);
		}
		
	public void pass()
	{
		password.sendKeys("Shubh@1211");
	}

	public void signin()
	{
		signin.click();
	}
		
	}

