package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demogurumenu 
{
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/test/simple_context_menu.html";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);	
	}
	@Test
	public void clickmethd()
	{

		WebElement rightclick= driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		WebElement dblclick= driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
//WebElement rightclick= driver.findElement(By.cssSelector("span[class='context-menu-one btn btn-neutral context-menu-active']"));
		Actions act = new Actions(driver);
		act.contextClick(rightclick).perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
		Alert a=	driver.switchTo().alert();
        a.accept();
		
		act.doubleClick(dblclick);
		act.perform();
		Alert b=driver.switchTo().alert();
		b.accept();
		System.out.println("alert=" +a.getText());
	}
}
	
