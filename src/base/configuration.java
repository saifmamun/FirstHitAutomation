package base;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.WebDriverFunctions;

public class configuration extends WebDriverFunctions {
	
	public static void main (String[]args){
		//System.setProperty("webdriver.chrome.driver","C:/Users/saifa/workspace/FirstHitAutomation/Driver/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","C:/Users/saifa/workspace/FirstHitAutomation/Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	}
}
		
		
			