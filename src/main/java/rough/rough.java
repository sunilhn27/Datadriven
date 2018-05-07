package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import TestBase.TestBase;

public class rough extends TestBase {

	@BeforeSuite
	public void setuo() throws Exception {
		TestBase.setup();
	}

	@Test
	public void adminclick() {
		d.findElement(By.id("txtUsername")).sendKeys("Admin");
		d.findElement(By.id("txtPassword")).sendKeys("admin");
		d.findElement(By.name("Submit")).click();
		d.findElement(By.xpath(".//*[@id='menu_directory_viewDirectory']/b")).click();
		WebElement admin = d.findElement(By.xpath(".//*[@id='menu_admin_viewAdminModule']/b"));
		admin.click();
	}

}
