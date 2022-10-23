package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {

	public static WebDriver driver=null; //initialise selenium webdriver
	
	@BeforeSuite //Before test this will be called
	public void setup() {
		WebDriverManager.chromedriver().setup(); //chromedriver initialized
		driver=new ChromeDriver();
	}
	
	@AfterSuite//after test
	public void tearDown() {
		driver.quit();
	}
	
	
}

