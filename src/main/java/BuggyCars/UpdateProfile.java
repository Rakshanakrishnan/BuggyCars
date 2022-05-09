package BuggyCars;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.apache.logging.log4j.*;

import PageObjects.HomePage;
import PageObjects.Profile;

public class UpdateProfile extends Base {
	
	public WebDriver driver;
	private static Logger log= LogManager.getLogger(Base.class.getName());
	@Test(dataProvider="getData")
	public void Login(String login,String fname, String lname, String pwd, String confirmpwd) throws IOException, InterruptedException {
		driver= initialization();
		 driver.get(prop.getProperty("url"));
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 HomePage hp=new HomePage(driver);
		 hp.logintext().sendKeys(login);
			hp.pwd().sendKeys(pwd);
			hp.login().click();
			
			
	}
	@Test
	public void Update() throws InterruptedException {
		Profile p=new Profile(driver);
		p.profile().click();
		p.age().sendKeys("2");
		p.address().sendKeys("Auckland");
		p.save().click();
		Thread.sleep(1000);
		log.info("Updated User details successfully!");
	}
	
	@AfterTest
	public void quit() {
		driver.close();
	}

}
