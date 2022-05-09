package BuggyCars;

import java.io.IOException;



import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;


import org.testng.annotations.Test;

import org.apache.logging.log4j.*;
import PageObjects.HomePage;
import PageObjects.RegistrationPage;


public class LandingPage extends Base{
	public WebDriver driver;
	
	private static Logger log= LogManager.getLogger(Base.class.getName());
	public String text="Amazing Car!";
	@Test(dataProvider="getData")
	public void FirstPage(String login,String fname, String lname, String pwd, String confirmpwd) throws IOException, InterruptedException {
		driver= initialization();
		 driver.get(prop.getProperty("url"));
		 driver.manage().window().maximize();
		HomePage hp=new HomePage(driver);
		hp.register().click();
		
		RegistrationPage rp=new RegistrationPage(driver);
		rp.login().sendKeys(login);
		rp.firstName().sendKeys(fname);
		rp.lastName().sendKeys(lname);
		rp.password().sendKeys(pwd);
		rp.confirmPassword().sendKeys(confirmpwd);
		rp.Register().click();
		Thread.sleep(1000);
		log.info("User Registration is successful");


	}
	@AfterTest
	public void quit() {
		driver.close();
	}
	
}
