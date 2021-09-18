package pomclassAmazon;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;


public class amazonlogin {

		
		private WebDriver driver;

		@FindBy (xpath = "//span[@class='nav-line-2 ']")
		private WebElement account;
		
		@FindBy (xpath =( "(//span[text()='Sign in'])[1]"))
		private WebElement signinbutton;
		
		
	public amazonlogin (WebDriver driver)
	{this.driver = driver;
	
		PageFactory.initElements(driver, this);
	}
	public void account()
	{
		Actions act=new Actions(driver);
		act.moveToElement(account).perform();
	}
	public void signbutton()
	{

		Actions act = new Actions(driver);
		act.moveToElement(signinbutton).click().build().perform();
	}	
	}





