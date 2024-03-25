package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google
{
	ChromeDriver driver;
	String baseurl="https://www.google.com/";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void googlesearch() throws InterruptedException
	{
		driver.get(baseurl);
		//driver.findElement(By.id("books")).sendKeys("abc");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("books",Keys.ENTER);
		//Search.submit;
	
	
	
	}

}
