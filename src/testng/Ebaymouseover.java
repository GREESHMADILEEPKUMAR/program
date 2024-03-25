package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebaymouseover
{
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		driver.get("https://www.ebay.com");
		WebElement ele = driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/a"));

		//Creating object of an Actions class
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		WebElement elem = driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"));
		action.moveToElement(elem).click().build().perform();
	}
}
