package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class deleteemp {

	WebDriver d;

	@Test
	public void adminclick() {
		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\Chromedriver.exe");
		d = new ChromeDriver();
		d.get("http://opensource.demo.orangehrmlive.com/");
		d.findElement(By.id("txtUsername")).sendKeys("Admin");
		d.findElement(By.id("txtPassword")).sendKeys("admin");
		d.findElement(By.name("Submit")).click();
		WebElement admin = d.findElement(By.xpath(".//*[@id='menu_admin_viewAdminModule']/b"));
		admin.click();
		d.findElement(By.xpath(""));
		d.findElement(By.xpath(".//*[@id='btnDelete']")).click();
		WebDriverWait wait = new WebDriverWait(d, 15);
		WebElement aler = d.findElement(By.xpath(".//*[@id='deleteConfModal']/div[3]/input[2]"));
		if (aler.isDisplayed()) {
			System.out.println("is present");
		}
		if (aler.isEnabled()) {
			System.out.println("is enable");
			d.findElement(By.xpath(".//*[@id='deleteConfModal']/div[3]/input[2]")).click();
		}


	}
}