package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagran2 
{
	ChromeDriver driver;
	String baseurl="https://www.instagram.com/";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void fblogin() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[1]/div/label/input")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[2]/div/label/input")).sendKeys("abc");
		//driver.findElement(By.xpath("//form[@id='loginForm']/div/div[3]")).click();
		//login.submit();
		WebElement login=driver.findElement(By.name("abc"));
		login.sendKeys("abc,keys.ENTER");
	}
	
	}

