package pack123;





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ApplicationHeaderPage;
import pom.LoginPage;

import pom.UserPage;

public class TestClass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RVL SYSTEMS\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.sendUserName();
		loginPage.sendPasswordName();
		loginPage.clickOnKeepMeLogin();
		loginPage.clickOnLogin();
		
		ApplicationHeaderPage applicationHeaderPage = new ApplicationHeaderPage(driver);
		//applicationHeaderPage.clickOnTask();
		
//		TaskPage taskPage = new TaskPage(driver);
//	    taskPage.clickOnCreateTask();
//		taskPage.clickOnSelectCustomor();
//		taskPage.clickOnAllActiveCustomor();
//		taskPage.clickOnSelectProject();
//		taskPage.clickOnAllActiveProject();
//	    taskPage.sendTaskName1();
//		taskPage.clickOnDeadLine1();
//		taskPage.clickOnTypeOfWork1();
//		taskPage.clickOnCheckBox1();
//		taskPage.sendTaskName2();
//		taskPage.clickOnDeadLine2();
//		taskPage.clickOnTypeOfWork2();
//		taskPage.clickOnCheckBox2();
//		taskPage.sendTaskName3();
//		taskPage.clickOnDeadLine3();
//		taskPage.clickOnTypeOfWork3();
//		taskPage.clickOnCheckBox3();
//		taskPage.clickOnCreate();
//		
		applicationHeaderPage.clickOnUser();
		UserPage userPage= new UserPage(driver);
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

}
