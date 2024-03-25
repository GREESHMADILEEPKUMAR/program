package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Reddiflogocheck 
{
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void logodisplay()
	{
		boolean Logo =driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
			      if (Logo)
			      {
			         System.out.println("Logo present");
			      }
			      else 
			      {
			         System.out.println("Logo not present");
			      }
	}
	

		
	}


