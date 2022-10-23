package testCases;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;
import pageObject.PO_001_search;
import utlities.ReadFromXLSFile;
import utlities.WriteDataXLS;
public class TC001_GoToSite extends DriverSetup{
	public static String baseUrl = "https://google.com";
	
	@Test(enabled=true,priority=1,dataProviderClass=ReadFromXLSFile.class,dataProvider = "readXLS")
	public static void goToSite(ArrayList<String> testData) throws InterruptedException, IOException {

		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		PO_001_search scObj= new PO_001_search(driver);
		
		scObj.clickEnglish();
		
		ArrayList<String> maxString = new ArrayList<String>();
		ArrayList<String> minString = new ArrayList<String>();
		
		for (String value : testData) {
			scObj.sendValues(value);
			Thread.sleep(4000);
				String s1=scObj.getTextS1();
				String s2=scObj.getTextS2();
				String s3=scObj.getTextS3();
				String s4=scObj.getTextS4();
				String s5=scObj.getTextS5();
				String s6=scObj.getTextS6();
				String s7=scObj.getTextS7();
				String s8=scObj.getTextS8();
				String s9=scObj.getTextS9();
				String s10=scObj.getTextS10();
				
	            
				int s1Length=s1.length();
				int s2Length=s2.length();
				int s3Length=s3.length();
				int s4Length=s4.length();
				int s5Length=s5.length();
				int s6Length=s6.length();
				int s7Length=s7.length();
				int s8Length=s8.length();
				int s9Length=s9.length();
				int s10Length=s10.length();
				
				
				
				int max=Collections.max(Arrays.asList(s1Length,s2Length,s3Length,s4Length,s5Length,s6Length,s7Length,s8Length,s9Length,s10Length));
				
				boolean a=false;
				
				if(max==s1Length) {
					if(a==false) {
						maxString.add(s1);
						a=true;
						}
					
					
				}
				if(max==s2Length) {
					if(a==false) {
						
						maxString.add(s2);
						a=true;
						}
					
				}
				if(max==s3Length) {
					if(a==false) {
						maxString.add(s3);
						a=true;
						}
					
				}
				if(max==s4Length) {
					if(a==false) {
						maxString.add(s4);
						a=true;
						}
					
				}
				if(max==s5Length) {
					if(a==false) {
						maxString.add(s5);
						a=true;
						}
					
				}
				if(max==s6Length) {
					if(a==false) {
						maxString.add(s6);
						a=true;
						}
					
				}
				if(max==s7Length) {
					if(a==false) {
						maxString.add(s7);
						a=true;
						}
					
				}
				if(max==s8Length) {
					if(a==false) {
						maxString.add(s8);
						a=true;
						}
					
				}
				if(max==s9Length) {
					if(a==false) {
						maxString.add(s9);
						a=true;
						}
				}
				if(max==s10Length) {
					if(a==false) {
						maxString.add(s10);
						a=true;
						}
				}
				
				int min=Collections.min(Arrays.asList(s1Length,s2Length,s3Length,s4Length,s5Length,s6Length,s7Length,s8Length,s9Length,s10Length));
				
				boolean b=false;
				
				if(min==s1Length) {
					if(b==false) {
						minString.add(s1);
						b=true;
						}
					
				}
				if(min==s2Length) {
					if(b==false) {
						minString.add(s2);
						b=true;
						}
					
				}
				if(min==s3Length) {
					if(b==false) {
						minString.add(s3);
						b=true;
						}
					
				}
				if(min==s4Length) {
					if(b==false) {
						minString.add(s4);
						b=true;
						}
					
				}
				if(min==s5Length) {
					if(b==false) {
						minString.add(s5);
						b=true;
						}
					
				}
				if(min==s6Length) {
					if(b==false) {
						minString.add(s6);
						b=true;
						}
					
				}
				if(min==s7Length) {
					if(b==false) {
						minString.add(s7);
						b=true;
						}
					
				}
				if(min==s8Length) {
					if(b==false) {
						minString.add(s8);
						b=true;
						}
					
				}
				if(min==s9Length) {
					if(b==false) {
						minString.add(s9);
						b=true;
						}
					
				}
				if(min==s10Length) {
					if(b==false) {
						minString.add(s10);
						b=true;
						}
					
				}
				
				scObj.clearValues();	        
	      }
		
		
		String [][] obj = new String[maxString.size()][2];
		for(int i = 0; i < maxString.size(); i++){
		    obj[i][0] = maxString.get(i);
		    obj[i][1] = minString.get(i);
		}
		
		WriteDataXLS.writeExcel(obj);
		
		
	}
	
}
	
	
	