package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeaderPage {

  @FindBy (xpath="//a[@class='content tt_selected selected']")
  private WebElement trackTime;
  @FindBy (xpath="//a[@class='content tasks']")
  private WebElement task;
  @FindBy (xpath="//a[@class='content reports']")
  private WebElement report;
  @FindBy (xpath="//a[@class='content users']")
  private WebElement user;
  @FindBy (xpath="//a[@class='content calendar']")
  private WebElement workSchedule;
  @FindBy (xpath="//div[@class='popup_menu_icon warning_icon']")
  private WebElement setting;
  @FindBy (xpath="//div[@id='popup_menu_addons']")
  private WebElement plusButton;
  @FindBy (xpath="//div[@id='popup_menu_support']")
  private WebElement questionButton;
  @FindBy (xpath="//a[@class='userProfileLink username']")
  private WebElement sethHope;
  @FindBy (xpath="//a[@id='logoutLink']")
  private WebElement logout;
  
  public  ApplicationHeaderPage(WebDriver driver)
  {
	PageFactory.initElements(driver, this);
  }
  public void clickOnTrackTime() {
	  trackTime.click();
  }
  public void clickOnTask() {
	  task.click();
  }
  public void clikOnReport() {
	  report.click();
  }
  public void clickOnUser() {
	  user.click();
  }
  public void clickOnWorkSchedule() {
	  workSchedule.click();
  }
  public void clickOnSetting() {
	  setting.click();
  }
  public void clickOnPlusButton() {
	  plusButton.click();
  }
  public void clickOnQuestionButton() {
	  questionButton.click();
  }
  public void clickOnSethHope() {
	  sethHope.click();
  }
  public void clickOnLogOut() {
	  logout.click();
  }
}