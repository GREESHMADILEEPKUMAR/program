package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{

		ChromeDriver driver;
		String baseurl="https://www.amazon.in//";
		@Before
		public void setUp()
		{
			driver=new ChromeDriver();
			
		}
		@Test
		public void amazonsearch() throws InterruptedException
		{
			driver.get(baseurl);
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
			driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
			driver.findElement(By.xpath("//*[@id='nav-tools']/a[2]")).click();
			driver.navigate().back();
			driver.findElement(By.xpath("//*[@id='nav-cart-count-container']/span")).click();
			driver.findElement(By.xpath("//*[@id='nav-main']/div")).click();

			//WebElement search=driver.findElement(By.name("q"));
			//search.sendKeys("mobile",Keys.ENTER);
			//Search.submit;
		
		
		
		}
}
