package pomclassAmazon;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class amazoncart {
		
		private WebDriver driver;
			
			@FindBy (xpath = "//input[@id='twotabsearchtextbox']")
			private WebElement text ;
			
			
			@FindBy (xpath = "//input[@id='nav-search-submit-button']")
			private WebElement search ;
			
			@FindBy (xpath = "//div//img[@data-image-index='1']")
			private WebElement iphone ;
			
			@FindBy (xpath = "//*[@id=\"add-to-cart-button\"]")
			private WebElement added ;
			
			
//			@FindBy (xpath = "//div//span[text()='Account & Lists']")
//			private WebElement rightclick ;
//			
//			@FindBy (xpath = "//a//span[text()='Sign Out']")
//			private WebElement out ;
			
			//a//span[text()='Sign Out']
			
			//*[@id="add-to-cart-button"]
			//input[@id='add-to-cart-button']
//			@FindBy (xpath = "//span[@id='attach-sidesheet-view-cart-button-announce']")
//			private WebElement cart ;
			
				
			
		public amazoncart(WebDriver driver)
		{	
			this.driver = driver;
			
			PageFactory.initElements(driver, this);
		}
		
		public void text()
		{
		Actions act = new Actions(driver);
			act.moveToElement(text).click().build().perform();
			
			text.sendKeys("iphone11phone 64gb");	
		}
		public void search1() 
		{
			search.click();
		}
		public void pro() 
		{
			Actions act = new Actions(driver);
			act.moveToElement(iphone).click().build().perform();
		}
		public void add()
		{
			added.click();
		}

		

//		public void signoff()
//		{Actions act = new Actions(driver);
//		act.moveToElement(out).click().build().perform();
//		}
//		public void right()
//		{Actions act = new Actions(driver);
//		
//		act.moveToElement(rightclick).click().build().perform();		
//		}
		
		
		
//		public void cartopen()
//		{
//			cart.click();
//		}

	}



