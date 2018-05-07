package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;

import TestBase.TestBase;

public class addEmployeeOR extends TestBase {

	public addEmployeeOR(WebDriver d) {
		this.d = d;
	}

	By admin = By.xpath(".//*[@id='menu_admin_viewAdminModule']/b");

	By Add = By.xpath(".//*[@id='btnAdd']");

	By empname = By.xpath("//*[@id='systemUser_employeeName_empName']");

	By username = By.xpath(".//*[@id='systemUser_userName']");

	By password = By.xpath(".//*[@id='systemUser_password']");

	By confirmpass = By.xpath(".//*[@id='systemUser_confirmPassword']");

	By save = By.xpath(".//*[@id='btnSave']");

	public WebElement Admin() {
		TestBase.LogAndReport("clicked on Admin Button");
		return d.findElement(admin);
	}

	public WebElement EmpName() {
		TestBase.LogAndReport("Entered Username");
		return d.findElement(empname);
	}

	public WebElement Add() {
		TestBase.LogAndReport("Clicked on Add Button");
		return d.findElement(Add);
	}

	public WebElement username() {
		TestBase.LogAndReport("Username entered");
		return d.findElement(username);
	}

	public WebElement Password() {
		TestBase.LogAndReport("Password entered");
		return d.findElement(password);
	}

	public WebElement confirmpass() {
		TestBase.LogAndReport("confirmed pass entered");
		return d.findElement(confirmpass);
	}

	public WebElement Save() {
		TestBase.LogAndReport("Clicked on save button");
		return d.findElement(save);
	}
}
