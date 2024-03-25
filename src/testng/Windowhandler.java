package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandler
{
	WebDriver driver;
	@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
}
@Test
public void test()
{
driver.get("https://demo.guru99.com/popup.php");
String parentWindow = driver.getWindowHandle();//returns current window
System.out.println("parent window title" + driver.getTitle());
driver.findElement(By.xpath("/html/body/p/a")).click();
Set<String> allWindowHandles = driver.getWindowHandles();
for (String handle : allWindowHandles)
{
	if (!handle.equalsIgnoreCase(parentWindow))
		{
		driver.switchTo().window(handle);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("greeshmadileepkumar@gmail.com");
		driver.close();
		
		}
	driver.switchTo().window(parentWindow);
	}
}
}

