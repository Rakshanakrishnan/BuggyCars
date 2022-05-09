package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BuggyCars.Base;

public class RegistrationPage extends Base {
 public WebDriver driver;
 
 public RegistrationPage(WebDriver driver) {
	 this.driver=driver;
 }
 
 
 
 
 By login= By.id("username");

 public WebElement login() {
 	return driver.findElement(login);
 }
 By firstName= By.id("firstName");

 public WebElement firstName() {
 	return driver.findElement(firstName);
 }
 
 By lastName= By.id("lastName");

 public WebElement lastName() {
 	return driver.findElement(lastName);
 }
 
 By password= By.id("password");

 public WebElement password() {
 	return driver.findElement(password);
 }
 
 By confirmPassword= By.id("confirmPassword");

 public WebElement confirmPassword() {
 	return driver.findElement(confirmPassword);
 }
 
 By Register= By.xpath("//button[text()='Register']");
 public WebElement Register() {
	 	return driver.findElement(Register);
	 }
 
}
