package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import TestBase.TestBase;

public class addEmployee extends TestBase {

	public addEmployee(WebDriver d) {
		this.d = d;
	}

	By admin = By.xpath(".//*[@id='menu_admin_viewAdminModule']/b");

	By Add = By.xpath("//*[@id='btnAdd']");

	By empname = By.xpath("//*[@id='systemUser_employeeName_empName']");

	By username = By.xpath(".//*[@id='systemUser_userName']");

	By password = By.xpath(".//*[@id='systemUser_password']");

	By confirmpass = By.xpath(".//*[@id='systemUser_confirmPassword']");

	By save = By.xpath(".//*[@id='btnSave']");

	public WebElement Admin() {
		Actions a = new Actions(d);
		a.moveToElement(Admin());
		return d.findElement(admin);
	}

	public WebElement EmpName() {
		return d.findElement(empname);
	}

	public WebElement Add() {
		return d.findElement(Add);
	}

	public WebElement username() {
		return d.findElement(username);
	}

	public WebElement Password() {
		return d.findElement(password);
	}

	public WebElement confirmpass() {
		return d.findElement(confirmpass);
	}

	public WebElement Save() {
		return d.findElement(save);
	}
}
