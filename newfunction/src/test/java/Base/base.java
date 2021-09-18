package Base;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	public static  WebDriver openChromeBrowser()
	{
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	return driver;
	}
	
	public static WebDriver openFirefoxBrowser()
	{
	System.setProperty("webdriver.gecko.driver","D:\\firefox\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	return driver;

	
	}
}
