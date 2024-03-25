package Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagran 
{
	ChromeDriver driver;
	String baseurl="https://www.facebook.com/";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void fblogin()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("fsd");
	    driver.findElement(By.xpath("//button[@name='login']")).click();
	
	}
	@After
	public void close()
	{
	driver.close();
	}
	}

