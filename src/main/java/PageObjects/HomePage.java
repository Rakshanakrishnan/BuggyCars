package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BuggyCars.Base;

public class HomePage extends Base{

	
public WebDriver driver;
public HomePage(WebDriver driver) {
	this.driver=driver;
}

By register= By.cssSelector("a[href *='/register']");

public WebElement register() {
	return driver.findElement(register);
}

By logintext= By.xpath("//input[@name='login']");

public WebElement logintext() {
	return driver.findElement(logintext);
}
	
	By pwdtextbox= By.xpath("//input[@name='password']");

	public WebElement pwd() {
		return driver.findElement(pwdtextbox);
	}
	
		By loginbutton= By.xpath("//button[text()='Login']");

		public WebElement login() {
			return driver.findElement(loginbutton);
		}
		
		By Username= By.xpath("/html/body/my-app/header/nav/div/my-login/div/ul/li[1]/span");

		public WebElement Username() {
			return driver.findElement(Username);
		}

		By model= By.xpath("//img[@title='Diablo']");

		public WebElement PopularModel() {
			return driver.findElement(model);
		}
}
