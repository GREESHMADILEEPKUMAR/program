package pagepackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbcreateaccount 
{
	WebDriver driver;
	By createpage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By signup=By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");

	 public Fbcreateaccount(WebDriver driver) 
	 {
		this.driver=driver;
	}
//	public void setvalues(String username,String password)
//	 {
//		 driver.findElement(createpage).click();
//		 driver.findElement(signup).click();
//		 
//	 }
	 public void createpageclick()
	 {
		 driver.findElement(createpage).click();
		 
	 }
	 public void signupclick()
	 {
		 driver.findElement(signup).click();
	 }
	}


