package pomclassAmazon;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class amazonsign {
		

		@FindBy (xpath = "//div//input[@id='ap_email']")
		private WebElement email;
		
		@FindBy (xpath = "//span//input[@id='continue']")
		private WebElement contbutton ;

	public amazonsign (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void cbutton()
	{
		contbutton.click();
	}

	public void enteremail()
	{
		email.sendKeys("7038610144");
	}
	}



