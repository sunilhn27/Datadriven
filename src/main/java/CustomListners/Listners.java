package CustomListners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;

import TestBase.TestBase;

public class Listners extends TestBase implements ITestListener {

	public void onFinish(ITestContext arg0) {
		String name = arg0.getName();
		r.startTest(name);
		System.out.println("on finish");
		try {
			screenshot(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void onStart(ITestContext arg0) {
		String name = arg0.getName();
		r.startTest(name);
		r.log(LogStatus.INFO, "testStarted");
		System.out.println("on start");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

	}

	public void onTestFailure(ITestResult arg0) {
		String name = arg0.getName();
		try {
			screenshot(name);
			r.attachScreenshot("F:\\SpringFramework\\IBM\\src\\main\\resources\\Screenshot\\" + name + ".jpg");
			r.log(LogStatus.FAIL, "screen shot taken");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("on failure");
	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("on skipped");
		r.log(LogStatus.SKIP, "test Skipped for somereason");

	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("on start");
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("on success");
		r.log(LogStatus.INFO, "Testcase passsed succesfully");
	}

}
