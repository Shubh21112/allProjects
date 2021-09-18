package test;


	
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Base.base;
import pomclassAmazon.amazonLogout;
import pomclassAmazon.amazonPassword;
import pomclassAmazon.amazoncart;
import pomclassAmazon.amazonlogin;
import pomclassAmazon.amazonsign;
import utility.utiility;
	public class testClassAmazon extends base  {
		String url;
		private WebDriver driver;
		private	amazonlogin login;
		private amazonsign sign;
		private amazonPassword p;
		private amazoncart a;
		private amazonLogout o;
		private ArrayList<String> address;
		SoftAssert st;
		private  String testid;
		static ExtentTest test;
		static ExtentHtmlReporter reporter;
		@BeforeClass
		public void beforeClass()
		{
			login = new amazonlogin(driver);
			sign = new amazonsign(driver);
			p = new amazonPassword(driver);
			a = new amazoncart(driver);
			o = new amazonLogout(driver);
			address = new ArrayList<String>(driver.getWindowHandles());
			 st = new SoftAssert();
			 
		}
		@BeforeMethod
		public void enterUrl() throws InterruptedException
		{
			driver.get("https://www.amazon.in");
			
			Thread.sleep(3000);
			login.account();
			Thread.sleep(3000);

			login.signbutton();
			Thread.sleep(3000);

			sign.enteremail();
			
			sign.cbutton();
			Thread.sleep(5000);

			p.pass();
			p.signin();
			Thread.sleep(3000);			
		}
		@BeforeTest
		@Parameters("browser")
		public void launchBrwser(String browser) throws InterruptedException
		{reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"extendReport1.html");
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
			Thread.sleep(3000);
		    }
		@Test
		public void login() throws InterruptedException
		{
			testid = "logintest";
			Thread.sleep(5000);

			a.text();
			a.search1();
			url = driver.getCurrentUrl();
			System.out.println(url);
			
			Thread.sleep(5000);

			a.pro();
			url = driver.getCurrentUrl();
			
			System.out.println(url);
			st.assertNotEquals("https://www.amazon.in/s?k=iphone11phone+64gb&ref=nb_sb_noss"
																							, url);
			Thread.sleep(5000);


			address = new ArrayList<String>(driver.getWindowHandles());
			
			driver.switchTo().window(address.get(0));
			
//			 driver.getCurrentUrl();
//			String url = driver.getCurrentUrl();
//			System.out.println(url);
			Thread.sleep(2000);

			driver.switchTo().window(address.get(1));
//			System.out.println(url);
			
			Thread.sleep(3000);

			a.add();
			Thread.sleep(3000);
			driver.switchTo().window(address.get(0));
			Thread.sleep(3000);
			o.option();
			o.signoutbutton();
			}
			@AfterMethod
			public void end(ITestResult result) throws InterruptedException, IOException
			{if(ITestResult.FAILURE == result.getStatus())
			{
				utiility.takeScreenShot(driver, testid);
			}
			st.assertAll();
			driver.close();
			driver.quit();
		}
	}
		
	
		