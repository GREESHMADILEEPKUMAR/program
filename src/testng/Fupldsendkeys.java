package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fupldsendkeys 
		{
			ChromeDriver driver;
			String baseurl="https://demo.guru99.com/test/upload/";
			@BeforeTest
			public void setup()
			{
				driver=new ChromeDriver();
				driver.get(baseurl);	
			}
			@Test
			public void fuploadmethd()
			{
			
				WebElement element = driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
                element.sendKeys("\"E:\\Screenshots\\fb.png\"");
		
				driver.findElement(By.name("SubmitBtn")).click();
				String checkText = driver.findElement(By.id("submitbutton")).getText();
				Assert.assertEquals("File uploaded successfully", checkText);
			}	
		}



