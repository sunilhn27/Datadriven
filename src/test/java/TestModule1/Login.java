package TestModule1;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExReader.dataprovider;
import POM.LoginPageOR;
import TestBase.TestBase;

public class Login extends TestBase {

	LoginPageOR login = new LoginPageOR(d);

	@Test(dataProvider = "getdata")
	public void Logintest(Hashtable<String, String> data) throws Exception {

		System.out.println(data.get("username") + data.get("password"));

		login.Username().sendKeys(data.get("username"));
		login.password().sendKeys(data.get("password"));
		login.submit().click();

	}

	@DataProvider(name = "getdata")
	public static Object[][] getdata() {

		return dataprovider.getdata("TestA4", e);

	}
}
