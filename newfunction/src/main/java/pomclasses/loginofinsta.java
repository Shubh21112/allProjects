package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginofinsta {
	
private WebDriver driver;

	@FindBy (xpath = "//label//input[@name='username']")
	private WebElement username ;

@FindBy (xpath = "//input[@name='password']")
private WebElement password ;

@FindBy (xpath = "//button//div[text()='Log In']")
private WebElement loginbutton;


public loginofinsta(WebDriver driver)

{ this.driver = driver;
	PageFactory.initElements(driver, this);
}
public void enterusername()
{
	username.sendKeys("mr.bodkhe_1211");
}

public void password()
{
	password.sendKeys("Siya@143");
}
public void login()
{
	loginbutton.click();
}
}
