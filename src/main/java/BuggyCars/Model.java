package BuggyCars;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.apache.logging.log4j.*;

import PageObjects.HomePage;
import PageObjects.PopularModel;

public class Model extends Base {
	
	public WebDriver driver;
	public String text="Amazing Car!";
	private static Logger log= LogManager.getLogger(Base.class.getName());

	@Test(dataProvider="getData")
	public void voting(String login,String fname, String lname, String pwd, String confirmpwd) throws IOException, InterruptedException {
		driver= initialization();
		 driver.get(prop.getProperty("url"));
		 driver.manage().window().maximize();
		 HomePage hp=new HomePage(driver);
		 hp.logintext().sendKeys(login);
			hp.pwd().sendKeys(pwd);
			hp.login().click();
			Thread.sleep(1000);
			String message=hp.Username().getText();
			
			log.info("The User is logged in Successfully");
		
		 hp.PopularModel().click();
			
			  PopularModel pm=new PopularModel(driver); 
				/*
				 * int voteCountBefore =pm.getVotes(); System.out.println(voteCountBefore);
				 */
			  // this.comment.sendKeys(comment);
				/*
				 * pm.vote().click(); int voteCountAfter = pm.getVotes(); while (voteCountAfter
				 * == voteCountBefore) { voteCountAfter = pm.getVotes();
				 * 
				 * return voteCountAfter - voteCountBefore; }
				 */			 
			 String votecount=pm.votecount().getText();
			 String[] voteresult = votecount.split(":"); 
			 String vote=voteresult[0]; 
			 String votes=voteresult[1];
			 log.info("Before Voting:" +votes);
			 //System.out.println("votes:"+votes);
			 
			 pm.comment().sendKeys(text); 
			 pm.vote().click(); 
			 driver.navigate().refresh();
			 String votecount1=pm.votecount().getText(); 
			 String[] voteresult1 =votecount1.split(":"); 
			 String vote1=voteresult1[0]; 
			 String votes1=voteresult1[1]; 
			 log.info("After Voting:" +votes1);
			 Thread.sleep(1000);
				if(!votes.equals(votes1)) {
					log.info("Voted Successfully");
				}
				else {
					log.info("Voted Failed");
				}
				
				 
			
	}
	@AfterTest
	public void quit() {
		driver.close();
	}
}
