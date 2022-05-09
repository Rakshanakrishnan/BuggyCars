package BuggyCars;



import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Base {

	public WebDriver driver;
public Properties prop;
	@Test
		public WebDriver initialization() throws IOException, InterruptedException {
			 prop= new Properties();
			 FileInputStream fis=new FileInputStream("C:\\Users\\praka\\eclipse-workspace\\BuggyCars\\src\\main\\resources\\data.properties");
			 prop.load(fis);
			 String browserName=prop.getProperty("browser");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\praka\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver();
			 Thread.sleep(1000);
			 //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			return driver;
		}
		
		@DataProvider
		public Object[][] getData() {
			
			Object[][] data= new Object[1][5];
			
			data[0][0]="Tim";
			data[0][1]="Derik";
			data[0][2]="Mark";
			data[0][3]="TestData@1212";
			data[0][4]="TestData@1212";
			
			return data;
		}	
	
		
		 public String getScreenshot(String testcasename,WebDriver driver) throws IOException {
			 TakesScreenshot ts= (TakesScreenshot)driver;
			 File src=ts.getScreenshotAs(OutputType.FILE);
			 String destination= System.getProperty("user.dir")+"\\reports\\" +testcasename+".png";
			 FileUtils.copyFile(src, new File(destination));
			
			return destination;
		 }
		 
	
}

