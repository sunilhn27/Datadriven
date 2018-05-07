package TestModule1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import TestBase.TestBase;

public class Deleteemp extends TestBase {

	@Test
	public void DeleteAllEmp() {
		r.startTest("DELETE EMP");
		d.findElement(By.xpath(".//*[@id='ohrmList_chkSelectAll']")).click();
		d.findElement(By.xpath(".//*[@id='btnDelete']")).click();
		WebElement aler = d.findElement(By.xpath(".//*[@id='deleteConfModal']/div[3]/input[2]"));
		if (aler.isDisplayed()) {
			System.out.println("is present");
		}
		if (aler.isEnabled()) {
			System.out.println("is enable");
			d.findElement(By.xpath(".//*[@id='deleteConfModal']/div[3]/input[2]")).click();
			System.out.println("succes");
		}
	}
}
