package pack123;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
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

import pom.ApplicationHeaderPage;
import pom.LoginPage;
import pom.TaskPage;
import pom.UserPage;
import testBrowserSetup.Browser;
import utilities.Utilty;

public class TestNgTestClass2 extends Browser {
	    WebDriver driver;
	    LoginPage loginPage;
	    ApplicationHeaderPage applicationHeaderPage;
	    TaskPage taskPage;
	    UserPage userPage;
	    
	    int testID;
		static ExtentTest test;
		static ExtentHtmlReporter reporter;
		@BeforeTest
		@Parameters("browser")
		public void launchBrowser(String browser) {
			reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"extendReport.html");
			ExtentReports extend = new ExtentReports();
			extend.attachReporter(reporter);
			System.out.println("Before Test");
			if(browser.equalsIgnoreCase("Chrome"))
			{
				driver = openChromeBrowser();
			}
			
			else if(browser.equalsIgnoreCase("MicrosoftEdge"))
			{
				driver = openMicrosoftEdgeBrowser();
			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		@BeforeClass
		public void createObject() {
			loginPage = new LoginPage(driver);
			applicationHeaderPage = new ApplicationHeaderPage(driver);
			taskPage=new TaskPage(driver);
		    userPage=new UserPage(driver);
		}
		@BeforeMethod
		
		public void logInToApplication() {
			driver.get("http://localhost/login.do");
			
			loginPage.sendUserName();
			loginPage.sendPasswordName();
			loginPage.clickOnKeepMeLogin();
			loginPage.clickOnLogin();
			
			
		}
	
		@Test 
		public void userPageAction() {
			applicationHeaderPage.clickOnUser();
			userPage.clickOnUserButton();
			userPage.clickOnFirstName();
			userPage.clickOnLastName();
			userPage.clickOnEmailAddress();
			userPage.clickOnUserName();
			userPage.clickOnPassword();
			userPage.clickOnRetypePassword();
			userPage.clickOnTimeZone();
			userPage.clickOnReleaseDate();
			userPage.clickOnTimeTrackSubmission();
			userPage.clickOnTaskHierarchyManagement();
			userPage.clickOnReporting();
			userPage.clickOnUserManagementSettings();
			userPage.clickOnCreateUser();
		}
		@AfterMethod
		public void logoutAccount(ITestResult result) throws InterruptedException, IOException {
			if(ITestResult.FAILURE == result.getStatus())
			{
				Utilty.takeScreenshot(driver, testID);
			}
			Thread.sleep(10000);
			System.out.println("After Method");
			applicationHeaderPage.clickOnLogOut();
		}
		@AfterClass
		public void clearObjects() {
				System.out.println("After Class");
				applicationHeaderPage=null;
				loginPage=null;
				taskPage=null;
				userPage=null;
		}
		@AfterTest
		public void closeBrowser() {
			driver.quit();
		}

	}


