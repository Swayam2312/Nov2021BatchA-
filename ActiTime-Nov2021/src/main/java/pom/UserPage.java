package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	@FindBy (xpath="//div[@id='ext-gen6']")
	WebElement userButton;
	@FindBy (xpath="//input[@placeholder='First Name']")
	WebElement firstName;
	@FindBy (xpath="//input[@placeholder='Last Name']")
	WebElement lastName;
	@FindBy (xpath="//input[@placeholder='Email Address']")
	WebElement emailAddress;
	@FindBy (xpath="//input[@placeholder='Username']")
	WebElement userName;
	@FindBy (xpath="//input[@placeholder='Password']")
	WebElement password;
	@FindBy (xpath="//input[@placeholder='Retype Password']")
	WebElement retypePassword;
	@FindBy (xpath="(//button[@class='x-btn-text'])[12]")
	WebElement timeZone;
	@FindBy (xpath="//ul[@class='x-menu-list']//li[73]")
	WebElement selectTimeZone;
	@FindBy (xpath="//button[text()='select date']")
	WebElement releaseDate;
	@FindBy (xpath="(//table[@class='x-date-inner']//tr[3])//td[5]")
	WebElement selectReleaseDate;
	@FindBy (xpath="(//input[@type='checkbox'])[4]")
	WebElement timeTrackSubmission;
	@FindBy (xpath="(//input[@type='checkbox'])[5]")
	WebElement taskHierarchyManagement;
	@FindBy (xpath="(//input[@type='checkbox'])[7]")
	WebElement reporting;
	@FindBy (xpath="(//input[@type='checkbox'])[10]")
	WebElement userManagementSettings;
	@FindBy (xpath="//div[@id='userDataLightBox_commitBtn']")
	WebElement createUser;
	

	public UserPage(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	    }
	public void clickOnUserButton() {
		userButton.click();
	}
	public void clickOnFirstName() {
		firstName.click();
		firstName.sendKeys("swayam");
	}
	public void clickOnLastName() {
		lastName.click();
		lastName.sendKeys("katkar");
	}
	public void clickOnEmailAddress() {
		emailAddress.click();
		emailAddress.sendKeys("swayamkatkar@gmail.com");
	}
	public void clickOnUserName() {
		userName.click();
		userName.sendKeys("swayam9");
	}
	public void clickOnPassword() {
		password.click();
		password.sendKeys("Swayam@9");
	}
	public void clickOnRetypePassword() {
		retypePassword.click();
		retypePassword.sendKeys("Swayam@9");
	}
	public void clickOnTimeZone() {
		timeZone.click();
		selectTimeZone.click();
	}
	public void clickOnTimeTrackSubmission() {
		timeTrackSubmission.click();
	}
	public void clickOnReleaseDate() {
		releaseDate.click();
		selectReleaseDate.click();
	}
	public void clickOnTaskHierarchyManagement() {
		taskHierarchyManagement.click();
	}
	public void clickOnReporting() {
		reporting.click();
	}
	public void clickOnUserManagementSettings() {
		userManagementSettings.click();
	}
	public void clickOnCreateUser() {
		createUser.click();
	}
	
}
