package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class PO_001_search {
WebDriver driver=null;
	
	public PO_001_search(WebDriver driver) 
	{
		this.driver=driver;
	}
	By searchElm=By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input");
	By EnglishElm=By.linkText("English");
	By s1Elm=By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[1]/div/div[2]/div[1]/span");
	By s2Elm=By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[2]/div/div[2]/div[1]/span");
	By s3Elm=By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[3]/div/div[2]/div[1]/span");
	By s4Elm=By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[4]/div/div[2]/div[1]/span");
	By s5Elm=By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[5]/div/div[2]/div[1]/span");
	By s6Elm=By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[6]/div/div[2]/div[1]/span");
	By s7Elm=By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[7]/div/div[2]/div[1]/span");
	By s8Elm=By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[8]/div/div[2]/div[1]/span");
	By s9Elm=By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[9]/div/div[2]/div[1]/span");
	By s10Elm=By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[10]/div/div[2]/div[1]/span");
	
	public String getTextS1() 
	{
		return driver.findElement(s1Elm).getText();
	}
	public String getTextS2() 
	{
		return driver.findElement(s2Elm).getText();
	}
	public String getTextS3() 
	{
		return driver.findElement(s3Elm).getText();
	}
	public String getTextS4() 
	{
		return driver.findElement(s4Elm).getText();
	}
	public String getTextS5() 
	{
		return driver.findElement(s5Elm).getText();
	}
	public String getTextS6() 
	{
		return driver.findElement(s6Elm).getText();
	}
	public String getTextS7() 
	{
		return driver.findElement(s7Elm).getText();
	}
	public String getTextS8() 
	{
		return driver.findElement(s8Elm).getText();
	}
	public String getTextS9() 
	{
		return driver.findElement(s9Elm).getText();
	}
	public String getTextS10() 
	{
		return driver.findElement(s10Elm).getText();
	}
	public void sendValues(String values) {
		driver.findElement(searchElm).sendKeys(values);;
	}
	public void clearValues() {
		driver.findElement(searchElm).clear();
	}
	public void clickEnglish() {
		driver.findElement(EnglishElm).click();
	}
	
	

}
