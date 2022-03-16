package testBrowserSetup;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {
	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RVL SYSTEMS\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static WebDriver openMicrosoftEdgeBrowser() {
		System.setProperty("webdriver.edge.driver","D:\\Swayam\\velocity\\Apps\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		return driver;
	}
	public static WebDriver openFireFoxBrowser() {
		System.setProperty("webdriver.geaco.driver","D:\\Swayam\\velocity\\Apps\\geckodriver.exe");
		WebDriver driver = new EdgeDriver();
		return driver;
}
}
