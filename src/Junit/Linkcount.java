package Junit;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount 
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
	public void linkcount()
	{
		//List<WebElement> linklist  =driver.findElements(By.tagName("a"));
		List<WebElement> alltags  =driver.findElements(By.tagName("a"));
        System.out.println("Totaltags" +alltags.size());
        for(int i=0;i<alltags.size();i++) 
        {
        	System.out.println(alltags.get(i).getAttribute("href"));
        	System.out.println(alltags.get(i).getText());
        }
	}
        @After
    	public void close()
    	{
    	driver.close();
    	}
    	}

	

