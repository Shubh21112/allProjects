package pomclasses;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class dmlogo {
		private WebDriver driver;
		
		@FindBy (xpath = "//div[text()='krisha_12k']")
		private WebElement openkrish ;
		
//		@FindBy (xpath = "swapink7")
//		private WebElement opens7;
		
		//*[@id="f250441dd88f8bc"]/div/div/div/div
		//div[text()=	'_a_s_p_e_t_t_a_r_e']
		
		public dmlogo(WebDriver driver)
		{
			this.driver= driver;
			PageFactory.initElements(driver, this);
		
		}
		public void openkrisha()
		{
			openkrish.click();
		}

//		public void selectpp()
//		{
//			opens7.sendKeys("hi i am shubham bodkhe");
//		}
		
		//div[text()='krisha_12k']

	}


