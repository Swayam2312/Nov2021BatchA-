package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy (xpath="//input[@name='username']")
	private WebElement userName;
	
	@FindBy (xpath="//input[@name='pwd']")
	private WebElement password;
	
	@FindBy (xpath="//input[@name='remember']")
	private WebElement keepMeLoggedIn;
	
	@FindBy (xpath="//a[@id='loginButton']")
	private WebElement login;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendUserName() {
		userName.sendKeys("admin");
		
	}
	
	public void sendPasswordName() {
		password.sendKeys("manager");
	}
	
	public void clickOnKeepMeLogin() {
		if(!(keepMeLoggedIn.isSelected())) {
			keepMeLoggedIn.click();
		}
		else {
			System.out.println("keep me login check box already selected");
		}
		
	}
	
	public void clickOnLogin() {
		login.click();
	}
	
	

}
