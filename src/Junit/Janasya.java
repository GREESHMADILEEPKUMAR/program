package Junit;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasya
{
	ChromeDriver driver;
	String baseurl="https://www.janasya.us/";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void janasya()
	{
		driver.get(baseurl);
		String exp="Janasya";
		String actualtitle=driver.getTitle();
		if(actualtitle.equals(exp))
			{
			System.out.println("pass");
			}
			else
			{
				System.out.println("Fail");
			}
		driver.findElement(By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li/a/span")).click();
		driver.findElement(By.id("Search-In-Modal")).sendKeys("dress");
		driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[1]/h3")).click();
		driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--21650475286815__0551e2c3-4916-467e-a6e9-b0d8594a3ff3\"]/header/div/div/div[3]/div/div/a[1]")).click();
		List<WebElement> alltags  =driver.findElements(By.tagName("a"));
        System.out.println("Totaltags" +alltags.size());
        for(int i=0;i<alltags.size();i++) 
        {
        	System.out.println(alltags.get(i).getAttribute("href"));
        	System.out.println(alltags.get(i).getText());
        }
	}
       // @After
    	//public void close()
    	//{
    	//driver.close();
    	//}
    	

	}

