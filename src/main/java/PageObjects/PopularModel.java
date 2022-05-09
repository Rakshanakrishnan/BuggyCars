package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BuggyCars.Base;

public class PopularModel extends Base {
	
	public WebDriver driver;
	
	public PopularModel(WebDriver driver) {
		this.driver=driver;
	}
	
	By comment= By.id("comment");

	public WebElement comment() {
		return driver.findElement(comment);
	}
	
	public By vote= By.xpath("//button[text()='Vote!']");

	public WebElement vote() {
		return driver.findElement(vote);
	}
	
	/*
	 * @FindBy(xpath = "//h4[contains(text(),'Votes')]/strong") WebElement votes;
	 * public int getVotes() { return Integer.parseInt(votes.getText()); }
	 */
		
		  By votecount= By.xpath("/html/body/my-app/div/main/my-model/div/div[1]/div[3]/div[2]/div[1]/h4");
		 
		 public WebElement votecount() 
		 {
			 return driver.findElement(votecount);
		 }
		 
	
	 
}
