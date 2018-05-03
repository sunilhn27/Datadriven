package TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;

import ExReader.ExcelReader;

public class TestBase {

	public static Properties p = new Properties();
	public static WebDriver d = null;
	public static FileInputStream fs = null;
	public static ExtentReports r = ExtentReports.get(TestBase.class);
	public static Logger log = Logger.getLogger("IBMProject");
	public static ExcelReader e = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\main\\java\\ExReader\\Suite1.xlsx");

	@BeforeSuite
	public static void setup() throws Exception {
		System.out.println("af");
		if (d == null) {
			System.out.println("d");
			String log4jConfPath = "log4j.properties";
			PropertyConfigurator.configure(log4jConfPath);
			fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\config\\config.properties");
			p.load(fs);
			r.init(System.getProperty("user.dir") + "\\src\\main\\resources\\Reports\\reports.html", true);
			String browsername = p.getProperty("browser");
			System.out.println(browsername);
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\Chromedriver.exe");
				d = new ChromeDriver();
			} else if (browsername.equalsIgnoreCase("firefox")) {
				d = new FirefoxDriver();
			}

			d.manage().window().maximize();
			d.manage().deleteAllCookies();
			d.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
			log.info("Succesfully loaded");
			d.get("http://opensource.demo.orangehrmlive.com/");

			System.out.println("saf");
		}

	}

	public static void screenshot(String name) throws Exception {
		File scr = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,
				new File("F:\\SpringFramework\\IBM\\src\\main\\resources\\Screenshot\\" + name + ".jpg"));
		log.info("succesfully took the screen shot");
	}

	@AfterSuite
	public static void treardown() throws Exception {
		Thread.sleep(3000);
		log.info("closing browser");
		d.close();
	}
}
