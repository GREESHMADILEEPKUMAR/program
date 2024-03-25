package testpackg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepackages.Fbcreateaccount;

public class Fbcraeteaccounttest 
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}
	@Test
	public void test()
	{
		Fbcreateaccount ob=new Fbcreateaccount(driver);
		ob.createpageclick();
		ob.signupclick();
		
	}
}
