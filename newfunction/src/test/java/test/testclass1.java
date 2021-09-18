package test;

import java.io.File;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Base.base;
import extendReport1.ExtentTestNGIReporterListener;
import pomclasses.dmlogo;
import pomclasses.homepageinsta;
import pomclasses.krishadm;
import pomclasses.loginofinsta;
import pomclasses.myprofile;
import pomclasses.ppdm;
import utility.utiility;

public class testclass1 extends base  {
WebDriver driver;
loginofinsta log;
myprofile my;
dmlogo dm;
krishadm kdm;
private String testid;
static ExtentTest test;
static ExtentHtmlReporter reporter;
//ppdm  pdm;
homepageinsta hm;
	@BeforeTest
	@Parameters("browser")
	public void launchBrwser(String browser) {
	reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"extendReport1.html");
	ExtentReports extend = new ExtentReports();
	extend.attachReporter(reporter);
	
		if(browser.equals("chrome"))
		{
			driver = openChromeBrowser();
		}
		else
		{
			driver = openFirefoxBrowser();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void beforeMethod()
	{
	 log = new loginofinsta(driver);
	 dm = new dmlogo(driver);
	 kdm = new krishadm(driver);
//	 pdm = new ppdm(driver);
	 hm = new homepageinsta(driver);
	 my = new myprofile(driver);

	}
	@BeforeMethod
	public void launcurl()
	{
		driver.get("https://www.instagram.com");
	}
		
	@Test
	public void loginandtest() throws InterruptedException, EncryptedDocumentException, IOException{
		
	 testid = "logintest";
	 System.out.println(testid);
	 log.enterusername();
	 log.password();
	 log.login();
	
			hm.dontsave();
			Thread.sleep(3000);

			hm.notificationoff();
			hm.dmbutton();
			Thread.sleep(5000);
	}
	@Test
	public void dmtest() throws InterruptedException, IOException{
	
		dm.openkrisha();
	    Thread.sleep(3000);

		kdm.messagetextbox("hiii");
		
//		utiility.takeScreenShot(driver, testid);

		kdm.sendmessage();
		Thread.sleep(3000);
	}
		@AfterMethod
		public void logOutMethod(ITestResult result) throws IOException, InterruptedException {
			if(ITestResult.FAILURE == result.getStatus())
			{
				utiility.takeScreenShot(driver, testid);
			}
		my.myprofile();
		Thread.sleep(3000);
    	my.logout();
		Thread.sleep(3000);
		driver.close();
		}
	
		
	@AfterTest
	public void end()
		{ driver = null;
		 log =null;
		 my = null;
		 dm = null;
		 kdm = null;
//		 pdm = null;
		 hm = null;
		
			
		}	
}