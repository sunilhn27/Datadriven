package TestModule1;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExReader.dataprovider;
import POM.addEmployee;
import TestBase.TestBase;

public class addemployee extends TestBase {

	addEmployee emp = new addEmployee(d);

	@Test(dataProvider = "getdata")
	public void addemployeeTest(Hashtable<String, String> data) throws Exception {
		Thread.sleep(2000);
		System.out.println("inside addemp");
		emp.Admin().click();
		emp.Add().click();
		emp.EmpName().sendKeys(data.get("Empname"));
		emp.username().sendKeys(data.get("username"));
		emp.Password().sendKeys(data.get("password"));
		emp.confirmpass().sendKeys(data.get("confirmpassword"));
		emp.Save().click();
	}

	@DataProvider(name = "getdata")
	public static Object[][] getdata() {

		return dataprovider.getdata("AddEmployee", e);

	}
}
