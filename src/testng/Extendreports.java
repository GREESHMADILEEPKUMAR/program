package testng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extendreports 
{
WebDriver driver;
String baseurl="https://www.facebook.com/";
ExtentHtmlReporter reporter;
ExtentTest test;
ExtentReports extent;
@BeforeTest
public void bfrtest()
{
	reporter=new ExtentHtmlReporter("./Reports/myreport1.html");
	reporter.config().setDocumentTitle("Automation Report");
	reporter.config().setReportName("Functinal Test");
	reporter.config().setTheme(Theme.DARK);
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("hostname", "loacalhost");
	extent.setSystemInfo("os", "Wimdows10");
	extent.setSystemInfo("Tester Name", "Greeshma Dileep");
	extent.setSystemInfo("Browser name", "Chrome");
	driver=new ChromeDriver();
}
@BeforeMethod
public void setup()
{
driver.get(baseurl);	
}
@Test
public void fbtitleverification() 
{
	test=extent.createTest("Fbtitleverification");// give this for every test
	String exp="Facebook";
	String actual=driver.getTitle();
	Assert.assertEquals(actual, exp);
	}
@Test
public void buttonverification() 
{
	
}

@AfterTest
public void teardown()
{
extent.flush();	
}
@AfterMethod
public void browsrclose(ITestResult result )throws IOException 
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		test.log(Status.FAIL, "Test case failed is" +result.getName());
		test.log(Status.FAIL, "Test case failed is" +result.getThrowable());
		String Screenshotpath=screenshotMethod(driver,result.getName());
		test.addScreenCaptureFromPath(Screenshotpath);
	}
	else if(result.getStatus()==ITestResult.SKIP)
		
	{
		test.log(Status.SKIP,"Test skipped is" +result.getName());
	}
	else if(result.getStatus()==ITestResult.SUCCESS)
	{
		test.log(Status.SKIP,"Test passed is" +result.getName());
	}	
	}
public static String screenshotMethod(WebDriver driver,String screenshotname) throws IOException
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String dest="./Screenshot/"+screenshotname +".jpeg";
	FileHandler.copy(src, new File(dest));
	return dest;
}	
}

