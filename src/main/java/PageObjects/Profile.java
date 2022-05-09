package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BuggyCars.Base;

public class Profile extends Base{
	public WebDriver driver;
	public Profile(WebDriver driver) {
		 this.driver=driver;
	 }
	
	By age= By.id("age");

	 public WebElement age() {
	 	return driver.findElement(age);
	 }
	 
	 By address= By.id("address");

	 public WebElement address() {
	 	return driver.findElement(address);
	 }
	 

	 
	 By profile= By.xpath("//a[text()='Profile']");
	 public WebElement profile() {
	 	return driver.findElement(profile);
	 }
	 
	 By save= By.xpath("//button[text()='Save']");
	 public WebElement save() {
	 	return driver.findElement(save);
	 }

}
