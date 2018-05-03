package TestModule1;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExReader.dataprovider;
import POM.LoginPage;
import TestBase.TestBase;

public class Login extends TestBase {

	LoginPage login = new LoginPage(d);

	@Test(dataProvider = "getdata")
	public void test(Hashtable<String, String> data) throws Exception {

		System.out.println(data.get("username") + data.get("password"));
		/*
		 * d.findElement(By.id("txtUsername")).sendKeys(data.get("username"));
		 * d.findElement(By.id("txtPassword")).sendKeys(data.get("password"));
		 * d.findElement(By.name("Submit")).click();
		 */

		login.Username().sendKeys(data.get("username"));
		login.password().sendKeys(data.get("password"));
		login.submit().click();
		Thread.sleep(2200);
		login.Username().clear();
		login.password().clear();

	}

	@DataProvider(name = "getdata")
	public static Object[][] getdata() {

		return dataprovider.getdata("TestA4", e);

	}
}
