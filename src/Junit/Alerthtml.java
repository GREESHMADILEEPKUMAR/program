package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthtml 
{
	
		ChromeDriver driver;
		String baseurl="file:///C:/Users/Rahul/Documents/alert.html";
	
		@Before
		public void setUp()
		{
			driver = new ChromeDriver();
			driver.get(baseurl);
		}
		@Test
		public void averify()
		{
			
			driver.findElement(By.xpath("/html/body/input[1]")).click();
			Alert a= driver.switchTo().alert();
			String alerttext=a.getText();
			System.out.println("alert text="+alerttext);
			a.accept();
			//a.dismiss();// to cancel alert
			driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Greeshma");
			driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Rahul");
			driver.findElement(By.xpath("/html/body/input[4]")).click();


			
		}
		
}
