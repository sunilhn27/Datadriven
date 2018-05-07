package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.TestBase;

public class LoginPageOR extends TestBase {

	public LoginPageOR(WebDriver d) {
		this.d = d;
	}

	By username = By.id("txtUsername");
	By password = By.id("txtPassword");
	By Submit = By.name("Submit");

	public WebElement Username() {
		TestBase.LogAndReport("entered URl");
		TestBase.LogAndReport("Username entered");
		return d.findElement(username);
	}

	public WebElement password() {
		TestBase.LogAndReport("Password entered");
		return d.findElement(password);
	}

	public WebElement submit() {
		TestBase.LogAndReport("Clicked on submit Button");
		return d.findElement(Submit);
	}

}
