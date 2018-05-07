package TestModule1;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExReader.dataprovider;
import POM.addEmployeeOR;
import TestBase.TestBase;

public class addemployee extends TestBase {

	addEmployeeOR emp = new addEmployeeOR(d);

	@Test(dataProvider = "add")
	public void addemployeeTest(Hashtable<String, String> data) throws Exception {
		r.startTest("ADD EMP");
		System.out.println("emp" + data.get("Empname") + "user" + data.get("username"));
		System.out.println("inside addemp");
		Thread.sleep(3200);
		emp.Admin().click();
		Thread.sleep(3200);
		emp.Add().click();
		emp.EmpName().sendKeys(data.get("Empname"));
		System.out.println("username");
		emp.username().sendKeys(data.get("username"));
		emp.Password().sendKeys(data.get("password"));
		emp.confirmpass().sendKeys(data.get("confirmpassword"));
		emp.Save().click();
		//Assert.fail();

	}

	@DataProvider(name = "add")
	public static Object[][] getdata() {
		return dataprovider.getdata("AddEmployee", e);

	}
}
