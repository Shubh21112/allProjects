package pomclasses;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class krishadm {
    private WebDriver driver;
    
	@FindBy (xpath = "//div//textarea[@placeholder='Message...']")
	private WebElement clicktextbox;
	
	@FindBy (xpath = "//div//button[text()='Send']")
	private WebElement sends;
	//div//button[text()='Send']
	
	//div//textarea[@placeholder='Message...']
	
	
	public krishadm (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void messagetextbox(String string)
	{
		clicktextbox.sendKeys(string);
	}
	public void sendmessage()
	{
		sends.click();
	}
}
