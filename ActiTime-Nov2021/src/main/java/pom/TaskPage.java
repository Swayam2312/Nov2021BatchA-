package pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
   

	
	@FindBy (xpath= "//div[@id='ext-comp-1016']")
	private WebElement createTask;
	@FindBy (xpath= "(//button[@class='x-btn-text'])[1]")
	private WebElement selectCustomor;
	@FindBy (xpath= "//a[@id='ext-gen208']")
	private WebElement allActiveCustomor;
	@FindBy (xpath= "(//button[@class='x-btn-text'])[2]")
	private WebElement selectProject;
	@FindBy (xpath= "//a[@id='ext-gen1792']")
	private WebElement allActiveProject;
	@FindBy (xpath= "//div[@id='createTasksPopup_importTasks']")
	private WebElement importTask;
	@FindBy (xpath= "(//input[@placeholder='Enter task name'])[1]")
	private WebElement taskName1;
	@FindBy (xpath= "(//input[@placeholder='Enter task name'])[2]")
	private WebElement taskName2;
	@FindBy (xpath= "(//input[@placeholder='Enter task name'])[3]")
	private WebElement taskName3;
	@FindBy (xpath= "(//a[@id='descriptionElement'])[1]")
	private WebElement taskNameEdit1;
	@FindBy (xpath= "(//a[@id='descriptionElement'])[2]")
	private WebElement taskNameEdit2;
	@FindBy (xpath= "(//a[@id='descriptionElement'])[3]")
	private WebElement taskNameEdit3;
	@FindBy (xpath= "//button[@class='x-btn-text'])[3]")
	private WebElement deadLine1;
	@FindBy (xpath= "//table[@id='ext-gen1953']//tr[4]//td[2]")
	private WebElement deadLine1Date;
	@FindBy (xpath= "//button[@class='x-btn-text'])[5]")
	private WebElement deadLine2;
	@FindBy (xpath= "//table[@id='ext-gen1953']//tr[4]//td[3]")
	private WebElement deadLine2Date;
	@FindBy (xpath= "//button[@class='x-btn-text'])[7]")
	private WebElement deadLine3;
	@FindBy (xpath= "//table[@id='ext-gen1953']//tr[4]//td[5]")
	private WebElement deadLine3Date;
	@FindBy (xpath= "//button[@class='x-btn-text'])[4]")
	private WebElement  typeOfWork1;
	@FindBy (xpath= "//a[@id='ext-gen1531']")
	private WebElement  typeOfWork1Data;
	@FindBy (xpath= "//button[@class='x-btn-text'])[6]")
	private WebElement typeOfWork2;
	@FindBy (xpath= "//a[@id='ext-gen2100']")
	private WebElement  typeOfWork2Data;
	@FindBy (xpath= "//button[@class='x-btn-text'])[8]")
	private WebElement typeOfWork3;
	@FindBy (xpath= "//a[@id='ext-gen2144']")
	private WebElement  typeOfWork3Data;
	@FindBy (xpath= "//input[@id='createTasksPopup_addAllToTasksCheckbox']")
	private WebElement checkBox;
	@FindBy (xpath= "(//td[@class='addToTTCell'])[1]")
	private WebElement checkBox1;
	@FindBy (xpath= "(//td[@class='addToTTCell'])[2]")
	private WebElement checkBox2;
	@FindBy (xpath= "(//td[@class='addToTTCell'])[3]")
	private WebElement checkBox3;
	@FindBy (xpath= "(//a[@href='javascript: void(0)'])[1]")
	private WebElement addNewRow;
	@FindBy (xpath= "(//a[@href='javascript: void(0)'])[2]")
	private WebElement add5Row;
	@FindBy (xpath= "(//a[@href='javascript: void(0)'])[3]")
	private WebElement add10Row;
	@FindBy (xpath= "//div[@id='createTasksPopup_commitBtn']")
	private WebElement create;
	@FindBy (xpath= "//div[@id='createTasksPopup_cancelBtn']")
	private WebElement cancel;
	@FindBy (xpath= "//div[@class='close-button']")
	private WebElement close;
	
	private Actions actions;


	public TaskPage(WebDriver driver) {
    PageFactory.initElements(driver, this);
    actions = new Actions(driver);
	}
	public void clickOnCreateTask() {
		createTask.click();
	}
	public void clickOnSelectCustomor() {
		selectCustomor.click();
	}
	public void clickOnAllActiveCustomor() {
		actions.click(allActiveCustomor);
	}
	public void clickOnSelectProject() {
		selectProject.click();
	}
	public void clickOnAllActiveProject() {
		actions.click(allActiveProject);
	}
	public void sendTaskName1() {
		taskName1.click();
		taskName1.sendKeys("Vishal Katkar");
	}
	public void clickOnDeadLine1() {
		deadLine1.click();
		deadLine1Date.click();
	}
	public void clickOnTypeOfWork1() {
		typeOfWork1.click();
		typeOfWork1Data.click();
	}
	public void clickOnCheckBox1() {
		checkBox1.click();
	}
	public void sendTaskName2() {
		taskName2.click();
		taskName2.sendKeys("Sangram Bhopale");
	}
	public void clickOnDeadLine2() {
		deadLine2.click();
		deadLine2Date.click();
	}
	public void clickOnTypeOfWork2() {
		typeOfWork2.click();
		typeOfWork2Data.click();
	}
	public void clickOnCheckBox2() {
		checkBox2.click();
	}
	public void sendTaskName3() {
		taskName3.click();
		taskName3.sendKeys("Ranjeet Sardesai");
	}
	public void clickOnDeadLine3() {
		deadLine3.click();
		deadLine3Date.click();
	}
	public void clickOnTypeOfWork3() {
		typeOfWork3.click();
		typeOfWork3Data.click();
	}
	public void clickOnCheckBox3() {
		checkBox3.click();
	}
	public void clickOnCreate() {
		create.click();
	}
	

}
