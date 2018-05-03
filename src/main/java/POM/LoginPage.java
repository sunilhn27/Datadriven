package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.TestBase;

public class LoginPage extends TestBase {

	public LoginPage(WebDriver d) {
		this.d = d;
		// PageFactory.initElements(d, this);s
	}

	By username = By.id("txtUsername");
	By password = By.id("txtPassword");
	By Submit = By.name("Submit");

	public WebElement Username() {
		return d.findElement(username);
	}

	public WebElement password() {
		return d.findElement(password);
	}

	public WebElement submit() {
		return d.findElement(Submit);
	}

}
