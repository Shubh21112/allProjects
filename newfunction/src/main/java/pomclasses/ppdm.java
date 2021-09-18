
package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ppdm {
	private WebDriver driver;
	
	@FindBy (xpath = "//div//textarea[@placeholder='Message...']")
	private WebElement clicktextbox;
	
	@FindBy (xpath = "//div//button[text()='Send']")
	private WebElement sendpp;
	
	
	//div[text()='_a_s_p_e_t_t_a_r_e']
	
	public ppdm(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void messagetextbox(String string)
	{
		clicktextbox.sendKeys(string);
	}
	public void sendmessage()
	{
		sendpp.click();
	}
}
