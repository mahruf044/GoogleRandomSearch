package testCases;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;
import utlities.ReadFromXLSFile;
@Test(priority=1)
public class TC001_Search extends DriverSetup{
	public static String baseUrl = "https://google.com";
	
    
	public static void goToSite() throws InterruptedException {

		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("English")).click();
		
		
	}
	
	
	@Test(priority=2,enabled=true,dataProviderClass=ReadFromXLSFile.class,dataProvider=("readXLS"))
	
	public static void searchAndStore(String Data)throws InterruptedException {
		
		
		/*if(Data.equals("Dhaka")==true) {
			System.out.println("a");
		}
		else if(Data.equals("Dhaka")==true) {
			System.out.println("a");
		}*/
		
		/*driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(Data);
		List<WebElement> allLinks = driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul"));*/

		/*Iterator<WebElement> itr = allLinks.iterator();
		while(itr.hasNext()) {
		    System.out.println(itr.next());
		}*/
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(Data);
		Thread.sleep(4000);
			String s=driver.findElement(By.className("wM6W7d")).getAttribute("innerText");
			System.out.println(s.length());
			//String s1=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[3]/div/div[2]/div[1]/span")).getText();
			String s1=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[3]/div/div[2]/div[1]/span")).getText();

			System.out.println(s1);
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).clear();
		
			
			
			
			
			
		}
	

			
	}
