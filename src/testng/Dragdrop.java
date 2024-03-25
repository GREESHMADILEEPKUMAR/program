package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dragdrop 
{
	
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/test/drag_drop.html";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);	
	}
	@Test
	public void copypastemethod()
	{
		WebElement dragsales= driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement dropsales= driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		WebElement dragbank= driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement dropbank= driver.findElement(By.xpath("//*//*[@id=\"bank\"]/li"));
		WebElement dragdebitamount= driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement dropdebitamount= driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement dragcreditamount= driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
         WebElement dropcreditamount= driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));

		Actions action = new Actions(driver);
		action.dragAndDrop(dragsales, dropsales).build().perform();
		action.dragAndDrop(dragbank, dropbank).build().perform();
		action.dragAndDrop(dragdebitamount, dropdebitamount).build().perform();
		action.dragAndDrop(dragcreditamount, dropcreditamount).build().perform();
	    if(driver.findElement(By.id("equal")).isDisplayed())
	    {
	    	System.out.println("Displayed as Perfect");
	    }
	    else
	    {
	    	System.out.println("Perfect not displayed");
	    }
	   
	   
	}
}
