package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazoncartwindowhandler 
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
	driver.get("https://www.amazon.in/");
	WebElement search=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	search.sendKeys("mobilephones",Keys.ENTER);
	String exptitle="Amazon.in:Mobile Phones";
	String acttitle=driver.getTitle();
	if(acttitle.equalsIgnoreCase(exptitle))
	{
		System.out.println("verified title");
	}
	String parentwindow = driver.getWindowHandle();//returns current window
	//System.out.println("parent window title" + driver.getTitle());
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	//driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[2]"))
	Set<String> allWindowHandles = driver.getWindowHandles();
	for (String handle : allWindowHandles)
	{
		if (!handle.equalsIgnoreCase(parentwindow))
			{
			driver.switchTo().window(handle);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)", "");
			driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();
			driver.findElement(By.xpath("/html/body/div[8]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/form/span/span/input")).click();

			//driver.close();
			
			}
		//driver.switchTo().window(parentwindow);
		}
}
}
